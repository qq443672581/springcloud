package cn.dlj1.ec.annotation.db;

import cn.dlj1.ec.db.types.QueryType;
import cn.dlj1.ec.enums.WidgetType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 应用于表单
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年9月30日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Form {

    /**
     * 表单控件的类型<br>
     */
    WidgetType type() default WidgetType.TEXT;

    /**
     * 查询类型<br>
     * 默认为空,可以为like equels between<br>
     *
     * @see 当然视情况而定 string类型肯定不会有between类型的<br>
     */
    QueryType query() default QueryType.EQUALS;

}
