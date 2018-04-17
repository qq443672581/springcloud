package cn.dlj1.ec.utils;

import java.lang.reflect.Field;
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


}

class Impl {

    private static final Object lock = new Object();
    private static final Map<Class<?>, Field[]> classFields = new HashMap<Class<?>, Field[]>();
    private static final Map<Class<?>, String[]> classFieldsString = new HashMap<Class<?>, String[]>();

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


}