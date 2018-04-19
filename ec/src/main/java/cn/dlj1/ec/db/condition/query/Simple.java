package cn.dlj1.ec.db.condition.query;

import cn.dlj1.ec.enums.QueryType;
import cn.dlj1.ec.db.condition.Query;

/**
 * 简单条件查询
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/19 22:22
 */
public class Simple extends Query {

    private String field;

    private Object value;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Simple(QueryType queryType, String field, Object value) {
        super(queryType);
        this.field = field;
        this.value = value;
    }

}
