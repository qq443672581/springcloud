package cn.dlj1.ec.annotation.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 权限菜单注解
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年11月29日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Menu {

    /**
     * 菜单名
     */
    String value();

    /**
     * 如果是一个按钮
     * 指定key
     */
    String key() default "";

    /**
     * 是否显示，对外部暴漏
     *
     * @return
     */
    boolean show() default true;

    /**
     * 是否是这个模块的入口模块
     * 一个模块 都需要一个用于展示的地址，这个就是用来标注
     * 比如 user 模块 那么 展示的应该是一个 表格
     * 如果此菜单为 table 那么可以直接进行指定
     * <p>
     * 每个模块都只能有一个入口
     * 所以如果有冲突取 最后一个为主入口
     *
     * @return
     */
    boolean entrance() default false;

}