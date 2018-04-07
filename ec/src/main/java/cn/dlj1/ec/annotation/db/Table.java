package cn.dlj1.ec.annotation.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 应用于 数据库表的实体类
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年9月30日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Table {

    /*
     * 表解释
     */
    String name();

    /*
     * 表名
     */
    String value();

    /*
     * 主键
     */
    String pk() default "id";

}
