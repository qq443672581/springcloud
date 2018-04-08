package cn.dlj1.ec.annotation.db.utils;

import cn.dlj1.ec.annotation.db.More;
import cn.dlj1.ec.pojo.entity.Entity;

import java.lang.reflect.Field;

public class MoreUtils {

    public static More get(Field field) {
        return field.getAnnotation(More.class);
    }

    public static String getOne(Field field) {
        return get(field).one();
    }

    public static String getMore(Field field) {
        return get(field).more();
    }

    public static Class<? extends Entity> getClazz(Field field) {
        return get(field).clazz();
    }

    public static boolean has(Field field) {
        return null != field.getAnnotation(More.class);
    }
}
