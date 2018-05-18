package cn.dlj1.ec.db.annotations.utils;

import cn.dlj1.ec.db.annotations.Rules;

import java.lang.reflect.Field;

/**
 * 字段规则注解工具类
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年10月14日
 */
public class RulesUtils {

    public static Rules get(Field field) {
        return field.getAnnotation(Rules.class);
    }

    public static boolean isQuery(Field field) {
        Rules rules = get(field);
        if (null == rules) {
            return true;
        }
        return rules.isQuery();
    }

    public static boolean has(Field field) {
        return null != get(field);
    }

}
