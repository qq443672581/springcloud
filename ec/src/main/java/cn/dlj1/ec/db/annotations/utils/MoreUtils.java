package cn.dlj1.ec.db.annotations.utils;

import cn.dlj1.ec.db.annotations.More;
import cn.dlj1.ec.db.entity.Entity;

import java.lang.reflect.Field;

public class MoreUtils {

    public static More get(Field field) {
        return field.getAnnotation(More.class);
    }

    public static String getOne(Field field) {
        return get(field).field();
    }

    public static String getMore(Field field) {
        return get(field).field();
    }

    public static Class<? extends Entity> getClazz(Field field) {
        return get(field).clazz();
    }

    public static boolean has(Field field) {
        return null != field.getAnnotation(More.class);
    }
}
