package cn.dlj1.ec.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 类工具
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/9
 */
public class ClassUtils {

    private static final Impl impl = new Impl();

    /**
     * 获取一个类的全部字段
     *
     * @param clazz
     * @return
     */
    public static Field[] getFields(Class<?> clazz) {
        return impl.getFields(clazz);
    }

    /**
     * 获取一个类的全部字段
     *
     * @param clazz
     * @return
     */
    public static String[] getFieldsString(Class<?> clazz) {
        return impl.getFieldsString(clazz);
    }

    public static Method getMethod(Class<?> clazz, Field field) {
        return impl.getMethod(clazz, field);
    }

    public static Object getValue(Object object, Field field) {
        return impl.getValue(object, field);
    }

}

class Impl {

    private static final Object lock = new Object();
    // 类字段缓存
    private static final Map<Class<?>, Field[]> classFields = new HashMap<Class<?>, Field[]>();
    // 类字段字符串缓存
    private static final Map<Class<?>, String[]> classFieldsString = new HashMap<Class<?>, String[]>();
    // 字段get方法缓存
    private static final Map<Field, Method> fieldsGetMethod = new HashMap<Field, Method>();

    /**
     * 获取一个类的全部字段
     * 返回字段类
     *
     * @param clazz
     * @return
     */
    public Field[] getFields(Class<?> clazz) {
        Field[] fields = classFields.get(clazz);
        if (null != fields) {
            return fields;
        }

        synchronized (lock){
            fields = classFields.get(clazz);
            if (null != fields) {
                return fields;
            }

            Class<?> clazz_ = clazz;
            fields = new Field[0];
            while (clazz_ != Object.class) {
                Field[] fields_ = clazz_.getDeclaredFields();
                if (fields_.length != 0) {
                    int length = fields.length;
                    fields = Arrays.copyOf(fields, fields_.length + length);
                    for (int i = 0; i < fields_.length; i++) {
                        fields[length + i] = fields_[i];
                    }
                }
                clazz_ = clazz_.getSuperclass();
            }
            classFields.put(clazz, fields);
        }

        return fields;
    }

    /**
     * 获取一个类的全部字段
     * 返回字段字符串
     *
     * @param clazz
     * @return
     */
    public String[] getFieldsString(Class<?> clazz) {
        String[] fields = classFieldsString.get(clazz);
        if (null != fields) {
            return fields;
        }
        Field[] fs = getFields(clazz);
        fields = new String[fs.length];
        for (int i = 0; i < fs.length; i++) {
            fields[i] = fs[i].getName();
        }
        classFieldsString.put(clazz, fields);

        return fields;
    }

    public Method getMethod(Class<?> clazz, Field field) {
        Method method = fieldsGetMethod.get(field);
        if (null != method) {
            return method;
        }

        synchronized (lock){
            method = fieldsGetMethod.get(method);
            if (null != method) {
                return method;
            }
            String name = "get";
            if(field.getType() == boolean.class || field.getType() == Boolean.class){
                name = "is";
            }
            name = name + field.getName().substring(0,1).toUpperCase() + field.getName().substring(1);
            try {
                method = clazz.getMethod(name);
                fieldsGetMethod.put(field, method);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                return null;
            }

        }

        return method;
    }

    public Object getValue(Object object, Field field) {
        Method method = getMethod(object.getClass(), field);
        try {
            return method.invoke(object);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }


}