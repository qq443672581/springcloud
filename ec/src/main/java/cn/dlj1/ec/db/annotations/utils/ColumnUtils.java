package cn.dlj1.ec.db.annotations.utils;

import cn.dlj1.ec.db.annotations.Column;

import java.lang.reflect.Field;

/**
 * 数据库字段注解工具类
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年10月14日
 */
public class ColumnUtils {

    public static Column get(Field field) {
        return field.getAnnotation(Column.class);
    }

    public static String getValue(Field field) {
        String value = get(field).value();
        return "".equals(value) ? field.getName() : value;
    }

    public static String getName(Field field) {
        return get(field).name();
    }

    public static String getCommont(Field field) {
        return get(field).commont();
    }

    public static boolean has(Field field) {
        return null != get(field);
    }
}
