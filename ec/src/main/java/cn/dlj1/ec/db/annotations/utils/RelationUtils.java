package cn.dlj1.ec.db.annotations.utils;

import cn.dlj1.ec.db.annotations.Relation;
import cn.dlj1.ec.db.entity.Entity;

import java.lang.reflect.Field;

public class RelationUtils {

    public static Relation get(Field field) {
        return field.getAnnotation(Relation.class);
    }

    public static String getRelationField(Field field) {
        return get(field).relationField();
    }

    public static String[] getReturnFields(Field field) {
        return get(field).returnFields();
    }

    public static Class<? extends Entity> getClazz(Field field) {
        return get(field).clazz();
    }

    public static boolean has(Field field) {
        return null != get(field);
    }

}
