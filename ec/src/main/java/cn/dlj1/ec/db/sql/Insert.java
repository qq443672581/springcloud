package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.db.annotations.Column;
import cn.dlj1.ec.db.annotations.utils.ColumnUtils;
import cn.dlj1.ec.db.annotations.utils.TableUtils;
import cn.dlj1.ec.db.annotations.utils.TransientUtils;
import cn.dlj1.ec.db.entity.Entity;
import cn.dlj1.ec.db.exception.SqlBuildException;
import cn.dlj1.ec.db.utils.SqlUtils;
import cn.dlj1.ec.utils.ClassUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 插入
 *
 * @param <T>
 */
public class Insert<T extends Entity> extends Sql<T>{

    // insert原始sql
    static final String insert = "insert into @table(@columns) value(@values);";

    /**
     * 构建sql
     *
     * 获取实体
     * 获取字段
     * 遍历字段
     * 检查字段
     *
     *
     *
     * @return
     * @throws SqlBuildException
     */
    @Override
    public Sql<T> build() throws SqlBuildException{
        if(null == getEntity()){
            throw new SqlBuildException("[Insert]语法中实体不能为空!");
        }
        if(null == TableUtils.get(getClazz())){
            throw new SqlBuildException(
                    String.format("持久化实体[%s][@Table]注解不存在!",getClazz().getName()));
        }
        setSql(insert);

        String table = TableUtils.getValue(getClazz());
        replaceSql("@table",table);

        int nullSize = 0;
        Field[] fields = ClassUtils.getFields(getEntity().getClass());
        this.setParams(new Object[fields.length]);
        String[] columns = new String[fields.length];

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if(TransientUtils.has(field)){
               continue;
            }
            Object value = ClassUtils.getValue(getEntity(), field);
            if(null == value){
               nullSize++ ;
               continue;
            }
            setParams(i, value);
            columns[i] = ColumnUtils.getValue(field);
        }
        if(nullSize > 0){
            String[] columnsTemp = new String[fields.length - nullSize];
            Object[] paramsTemp = new Object[fields.length - nullSize];
            int j = 0;
            for (int i = 0; i < columns.length; i++) {
                if(null == columns[i]){
                    continue;
                }
                columnsTemp[j] = columns[i];
                paramsTemp[j] = getParams()[i];
                j++;
            }
            columns = columnsTemp;
            setParams(paramsTemp);
        }
        replaceSql("@columns", StringUtils.join(columns,","));
        replaceSql("@values", SqlUtils.getValueMarks(columns.length));

        return this;
    }

}
