package cn.dlj1.ec.db.annotations.utils;

import cn.dlj1.ec.db.annotations.Form;

import java.lang.reflect.Field;

/**
 * 表单字段注解工具类
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年10月14日
 */
public class FormUtils {

    public static Form get(Field field) {
        return field.getAnnotation(Form.class);
    }

    public static Form.Widget getWidgetType(Field field) {
        return get(field).widght();
    }

    public static Form.Query getQueryType(Field field) {
        return get(field).query();
    }

    public static boolean has(Field field) {
        return null != get(field);
    }

}
