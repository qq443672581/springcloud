package cn.dlj1.ec.db.component;

import cn.dlj1.ec.db.types.QueryType;
import cn.dlj1.ec.db.component.query.Between;
import cn.dlj1.ec.db.component.query.Composite;
import cn.dlj1.ec.db.component.query.Simple;

import java.util.Arrays;

/**
 * Cnd 条件工具类
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2017年12月27日
 */
public class CndUtils {

    /**
     * 创建一个cnd数组
     *
     * @param size
     * @return
     */
    public static Cnd[] create(int size) {
        return new Cnd[size];
    }

    /**
     * 创建一个空数组
     *
     * @return
     */
    public static Cnd[] create() {
        return create(0);
    }

    public static Cnd[] add(Cnd[] srcs, Cnd... cnds) {
        if (null == srcs) {
            srcs = new Cnd[0];
        }
        if(null == cnds || cnds.length == 0){
            return srcs;
        }
        int nullSize = 0;
        for (int i = 0; i < cnds.length; i++) {
            if(null == cnds[i]) nullSize++;
        }
        if(nullSize == cnds.length){
            return srcs;
        }
        srcs = Arrays.copyOf(srcs, srcs.length + cnds.length - nullSize);
        int index = srcs.length;
        for (int i = 0; i < cnds.length; i++) {
            srcs[index++] = cnds[i];
        }
        return srcs;
    }

    /**
     * 用于简单cnd
     *
     * @param field
     * @param type
     * @param value
     * @return
     */
    public static Cnd simple(String field, String type, Object value) {
        return simple(field, QueryType.getType(type), value);
    }

    public static Cnd simple(String field, QueryType type, Object value) {
        return new Simple(type, field, value);
    }

    /**
     * between
     *
     * @param field
     * @param left
     * @param right
     * @return
     */
    public static Cnd between(String field, Object left, Object right) {
        return new Between(field, left, right);
    }

    /**
     * and 多个条件
     *
     * @param querys
     * @return
     */
    public static Cnd and(Query[] querys) {
        return new Composite(querys);
    }


    //////////////////////////////////////////////
    public static Cnd equals(String field, Object value) {
        return new Simple(QueryType.EQUALS, field, value);
    }

    public static Cnd like(String field, Object value) {
        return new Simple(QueryType.LIKE, field, value);
    }

    public static Cnd start(String field, Object value) {
        return new Simple(QueryType.START, field, value);
    }

    public static Cnd get(String field, Object value) {
        return new Simple(QueryType.GET, field, value);
    }

    public static Cnd in(String field, Object value) {
        return new Simple(QueryType.IN, field, value);
    }


}
