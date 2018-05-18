package cn.dlj1.ec.db.annotations;

import cn.dlj1.ec.db.entity.Entity;

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
     * 当前实体关联字段
     *
     * @return
     */
    String current() default "id";

    /**
     * 关联方的实体类型
     *
     * @return
     */
    Class<? extends Entity> clazz();

    /**
     * 关联方的实体关联字段
     *
     * @return
     */
    String field();

    /**
     * 是否懒加载
     *
     * @// TODO: 2018/5/17 还没有实现
     *
     * @return
     */
    boolean lazy() default false;

}
