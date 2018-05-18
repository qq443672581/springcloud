package cn.dlj1.ec.db.annotations;

import cn.dlj1.ec.db.entity.Entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

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
     * 最小长度
     */
    int min() default -1;

    /*
     * 最大长度
     */
    int max() default -1;

    /*
     * 是否可以为空 默认true
     */
    boolean isEmpty() default true;

    /*
     * 是否唯一
     *
     * 如果为true，那么会在insert|update的时候进行检查
     */
    boolean isUnique() default false;

    /*
     * 是否可以新增
     */
    boolean isInsert() default true;

    /*
     * 是否可以修改
     */
    boolean isUpdate() default true;

    /*
     * 是否可以查询
     */
    boolean isQuery() default true;

    /*
     * 是否可以被查询返回
     */
    boolean isReturn() default true;

    /*
     * 自定义规则
     */
    Class<Rule> custom() default Rule.class;

    /**
     * 自定义规则需要实现的接口
     *
     */
    interface Rule{

        /**
         * 实现方法
         *
         * @return
         */
        boolean realize(Entity entity, Field field);

    }
}
