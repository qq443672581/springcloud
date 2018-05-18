package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.db.annotations.Table;
import cn.dlj1.ec.db.annotations.utils.*;
import cn.dlj1.ec.db.entity.Entity;
import cn.dlj1.ec.db.exception.SqlBuildException;
import cn.dlj1.ec.db.utils.SqlUtils;
import cn.dlj1.ec.utils.ClassUtils;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Field;

/**
 * 插入
 */
public class Insert extends Sql {

    // insert原始sql
    static final String insert = "insert into @table(@columns) value(@values);";

    /**
     * 构建sql
     * <p>
     * 获取实体
     * 获取字段
     * 遍历字段
     * 检查字段
     *
     * @return
     * @throws SqlBuildException
     */
    @Override
    public Sql build() throws SqlBuildException {
        if (null == getEntity()) {
            throw new SqlBuildException("[Insert]语法中实体不能为空!");
        }
        Table table = TableUtils.get(getClazz());
        if (null == table) {
            throw new SqlBuildException(
                    String.format("实体[%s]注解[@Table]不存在!", getClazz().getName()));
        }
        setSql(insert);
        replaceSql("@table", table.value());

        int nullSize = 0;
        Field[] fields = ClassUtils.getFields(getEntity().getClass());
        this.setParams(new Object[fields.length]);
        String[] columns = new String[fields.length];

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (TransientUtils.has(field)) {
                continue;
            }
            // 一对一 一对多
            if(OneUtils.has(field)){

            }else if(MoreUtils.has(field)){

            }

            Object value = null;
            try {
                value = ClassUtils.getValue(getEntity(), field);
            } catch (Exception e) {
                throw new SqlBuildException("反射获取属性值时错误,属性值" + field.getName());
            }

            if (null == value) {
                nullSize++;
                continue;
            }
            setParams(i, value);
            columns[i] = ColumnUtils.getValue(field);
        }
        if (nullSize > 0) {
            String[] columnsTemp = new String[fields.length - nullSize];
            Object[] paramsTemp = new Object[fields.length - nullSize];
            int j = 0;
            for (int i = 0; i < columns.length; i++) {
                if (null == columns[i]) {
                    continue;
                }
                columnsTemp[j] = columns[i];
                paramsTemp[j] = getParams()[i];
                j++;
            }
            columns = columnsTemp;
            setParams(paramsTemp);
        }
        replaceSql("@columns", StringUtils.join(columns, ","));
        replaceSql("@values", SqlUtils.getValueMarks(columns.length));

        return this;
    }

    public Insert(Class<? extends Entity> clazz) {
        super(clazz);
    }

    public Insert() {
        super(null);
    }

}
