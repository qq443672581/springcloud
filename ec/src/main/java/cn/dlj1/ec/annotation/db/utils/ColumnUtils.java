package cn.dlj1.ec.annotation.db.utils;

import cn.dlj1.ec.annotation.db.Column;

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
        String v = get(field).value();
        return "".equals(v) ? field.getName() : v;
    }

    public static String getName(Field field) {
        return get(field).name();
    }

    public static String getNote(Field field) {
        return get(field).note();
    }

    public static boolean has(Field field) {
        return null != get(field);
    }
}
