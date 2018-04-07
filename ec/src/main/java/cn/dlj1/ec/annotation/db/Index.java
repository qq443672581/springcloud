package cn.dlj1.ec.annotation.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 数据库索引
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2018年1月15日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Index {

    Item[] value();

    @interface Item {

        String[] fields();

        Type type() default Type.hash;
    }

    enum Type {
        hash, btree, unique
    }
}