package cn.dlj1.ec.db.annotations;

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
     * 字段解释
     */
    String name();

    /*
     * 字段名
     *
     * 如果为空 那么直接取实体类字段名为数据库表字段名
     */
    String value() default "";

    /*
     * 字段数据类型
     */
    Type type() default Type.VARCHAR;

    /*
     * 长度
     */
    int length() default -1;

    /*
     * 是否可空
     */
    boolean isEmpty() default false;

    /*
     * 是否自增
     *
     * @see 前提是这个字段是整型
     */
    boolean autoAdd() default false;

    /*
     * 注释
     */
    String commont() default "";

    /*
     * 默认值
     */
    String defaultValue() default "";

    /**
     * 数据类型
     */
    enum Type {

        INT("int", "整型"),
        BIGINT("bigint", "长整型"),
        FLOAT("float", "浮点型"),
        VARCHAR("varchar", "字符"),
        TEXT("text", "文本"),
        DATETIME("datetime", "时间日期"),
        DATE("date", "日期"),
        TIME("time", "时间");

        private String code;
        private String name;

        Type(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

    }
}
