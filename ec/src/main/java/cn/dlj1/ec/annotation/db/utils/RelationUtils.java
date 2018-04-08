package cn.dlj1.ec.annotation.db.utils;

import cn.dlj1.ec.annotation.db.Relation;
import cn.dlj1.ec.pojo.entity.Entity;

import java.lang.reflect.Field;

public class RelationUtils {

    public static Relation get(Field field) {
        return field.getAnnotation(Relation.class);
    }

    public static String getField(Field field) {
        return get(field).field();
    }

    public static String getReturnField(Field field) {
        return get(field).returnField();
    }

    public static Class<? extends Entity> getClazz(Field field) {
        return get(field).Class();
    }

    public static boolean has(Field field) {
        return null != get(field);
    }

}
