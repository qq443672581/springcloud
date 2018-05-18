package cn.dlj1.ec.db.annotations.utils;

import cn.dlj1.ec.db.annotations.Transient;

import java.lang.reflect.Field;

public class TransientUtils {

    public static boolean has(Field field) {
        return null != field.getAnnotation(Transient.class);
    }
}
