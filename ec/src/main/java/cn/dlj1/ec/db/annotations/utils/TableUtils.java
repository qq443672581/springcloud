package cn.dlj1.ec.db.annotations.utils;

import cn.dlj1.ec.db.annotations.Table;
import cn.dlj1.ec.db.entity.Entity;

/**
 * 数据库表注解工具类
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年10月14日
 */
public class TableUtils {

    public static Table get(Class<? extends Entity> type) {
        if(null == type){
            throw new NullPointerException();
        }
        return type.getAnnotation(Table.class);
    }

    public static String getName(Class<? extends Entity> type) {
        return prelude(type).name();
    }

    public static String getValue(Class<? extends Entity> type) {
        return prelude(type).value();
    }

    public static String getPrimaryKey(Class<? extends Entity> clazz) {
        return prelude(clazz).primaryKey();
    }

    private static Table prelude(Class<? extends Entity> clazz) {
        Table table = get(clazz);
        if (null == table) {
            throw new NullPointerException("@Table 不存在!");
        }
        return table;
    }

    public static boolean has(Class<? extends Entity> clazz){
        return null != get(clazz);
    }

    public static boolean has(Entity entity){
        if(null == entity){
            throw new NullPointerException();
        }
        return has(entity.getClass());
    }

}
