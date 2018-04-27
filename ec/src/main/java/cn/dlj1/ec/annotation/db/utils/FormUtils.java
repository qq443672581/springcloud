package cn.dlj1.ec.annotation.db.utils;

import cn.dlj1.ec.annotation.db.Form;
import cn.dlj1.ec.db.types.QueryType;
import cn.dlj1.ec.enums.WidgetType;

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

    public static WidgetType getWidgetType(Field field) {
        return get(field).type();
    }

    public static QueryType getQueryType(Field field) {
        return get(field).query();
    }

    /**
     * 不允许查询
     */
    public static boolean notAllowSearch(Field field) {
        return getQueryType(field) == QueryType.FALSE;
    }

    public static boolean has(Field field) {
        return null != get(field);
    }

}
