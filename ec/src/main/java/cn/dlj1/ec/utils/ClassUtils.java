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

    private static final Object lock = new Object();
    private static final Map<Class<?>, Field[]> classFields = new HashMap<Class<?>, Field[]>();

    /**
     * 获取一个类的全部字段
     *
     * @param clazz
     * @return
     */
    public static Field[] getFields(Class<?> clazz) {
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
            return fields;
        }
    }

}
