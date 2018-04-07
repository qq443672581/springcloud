package cn.dlj1.ec.annotation.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 应用于数据库表类的属性规则
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年9月30日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Rules {

    /*
     * 是否可以为空 默认true
     */
    boolean isNull() default true;

    /*
     * 是否唯一 默认false
     */
    boolean unique() default false;

    /*
     * 是否可以修改 默认true
     */
    boolean update() default true;

    /*
     * 是否可以被查询
     */
    boolean isSearch() default true;

    /*
     * 是否可以被查询返回
     */
    boolean isReturn() default true;

    /*
     * 最小长度
     */
    int min() default -1;

    /*
     * 最大长度
     */
    int max() default -1;


}
