package cn.dlj1.ec.annotation.db.utils;

import cn.dlj1.ec.annotation.db.Table;
import cn.dlj1.ec.pojo.entity.Entity;

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

    public static String getValue(String className) {
        return null;
    }

    public static String getPK(Class<? extends Entity> type) {
        return prelude(type).pk();
    }

    private static Table prelude(Class<? extends Entity> type) {
        Table table = get(type);
        if (null == table) {
            throw new NullPointerException("@Table 不存在!");
        }
        return table;
    }

    public static boolean has(Class<? extends Entity> type){
        return null != get(type);
    }

    public static boolean has(Entity entity){
        if(null == entity){
            throw new NullPointerException();
        }
        return has(entity.getClass());
    }

}
