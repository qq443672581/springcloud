package cn.dlj1.ec.db.condition.query;

import cn.dlj1.ec.annotation.db.enums.QueryType;
import cn.dlj1.ec.db.condition.Query;

/**
 * 两者间
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/19 22:23
 */
public class Between extends Query {

    private String field;

    private Object left;

    private Object right;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Object getLeft() {
        return left;
    }

    public void setLeft(Object left) {
        this.left = left;
    }

    public Object getRight() {
        return right;
    }

    public void setRight(Object right) {
        this.right = right;
    }

    public Between(String field, Object left, Object right) {
        super(QueryType.BETWEEN);
        this.field = field;
        this.left = left;
        this.right = right;
    }
}
