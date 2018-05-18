package cn.dlj1.ec.db.annotations.utils;

import cn.dlj1.ec.db.annotations.One;
import cn.dlj1.ec.db.entity.Entity;

import java.lang.reflect.Field;

public class OneUtils {

    public static One get(Field field) {
        return field.getAnnotation(One.class);
    }

    public static String getOne(Field field) {
        return get(field).field();
    }

    public static String getCurrent(Field field) {
        return get(field).current();
    }

    public static Class<? extends Entity> getClazz(Field field) {
        return get(field).clazz();
    }

    public static boolean has(Field field) {
        return null != field.getAnnotation(One.class);
    }
}
