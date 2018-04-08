package cn.dlj1.ec.annotation.db;

import cn.dlj1.ec.pojo.entity.Entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 一对多
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2017年11月9日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface More {

    /**
     * 用于一对多关联的 一 的字段
     *
     * @return
     */
    String one() default "id";

    /**
     * 多方的类型
     *
     * @return
     */
    Class<? extends Entity> clazz();

    /**
     * 用于一对多关联的 多 的字段
     *
     * @return
     */
    String more();
}
