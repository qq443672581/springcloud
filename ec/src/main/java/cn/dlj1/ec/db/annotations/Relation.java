package cn.dlj1.ec.db.annotations;

import cn.dlj1.ec.db.entity.Entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 数据关联<br>
 *
 * 字段关联于其他实现类的字段
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2017年4月14日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Relation {

    /**
     * 关联的实体类类型
     *
     * @return
     */
    Class<? extends Entity> clazz();

    /**
     * 于本字段所关联实体类中的字段
     *
     * @return
     */
    String relationField() default "id";

    /**
     * 需要返回关联实体类中的字段
     *
     * @return
     */
    String[] returnFields();

}
