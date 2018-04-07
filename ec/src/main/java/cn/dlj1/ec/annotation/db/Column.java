package cn.dlj1.ec.annotation.db;

import cn.dlj1.ec.annotation.db.enums.DataType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 应用于数据库表类的属性注解
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年9月30日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {

    /*
     * 属性解释
     */
    String name();

    /*
     * 属性在数据库中的名字
     */
    String value() default "";

    /*
     * 字段数据类型
     */
    DataType type() default DataType.VARCHAR;

    /*
     * 是否可以为空 默认true
     */
    boolean isNull() default true;

    /*
     * 长度
     */
    int length() default 0;

    /*
     * 自增？
     *
     * @see 前提是这个字段是整型
     */
    boolean autoAdd() default false;

    /*
     * 唯一约束
     */
    boolean unique() default false;

    /*
     * 备注,注释
     */
    String note() default "";

    /*
     * 默认值
     */
    String defaultValue() default "";

}
