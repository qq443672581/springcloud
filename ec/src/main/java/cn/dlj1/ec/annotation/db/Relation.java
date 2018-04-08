package cn.dlj1.ec.annotation.db;

import cn.dlj1.ec.pojo.entity.Entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 数据关联<br>
 * <p>
 * 关联于其他实体类,需要填写关联的实体、与本字段关联的字段、需要返回的字段
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2017年4月14日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Relation {

    Class<? extends Entity> Class();

    String field() default "id";

    String returnField();
}
