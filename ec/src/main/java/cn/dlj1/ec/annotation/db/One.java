package cn.dlj1.ec.annotation.db;

import cn.dlj1.ec.pojo.entity.Entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 一对一
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2017年12月20日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface One {

    /**
     * 当前方关联字段
     *
     * @return
     */
    String current() default "id";

    /**
     * 对应方的类型
     *
     * @return
     */
    Class<? extends Entity> clazz();

    /**
     * 对应方关联字段
     *
     * @return
     */
    String one();

}
