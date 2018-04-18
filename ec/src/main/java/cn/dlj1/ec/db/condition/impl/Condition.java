package cn.dlj1.ec.db.condition.impl;

import cn.dlj1.ec.annotation.db.enums.QueryType;
import cn.dlj1.ec.db.condition.Cnd;

public class Condition implements Cnd {

    private String field;

    private QueryType type = QueryType.EQUALS;

    private Object value;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public QueryType getType() {
        return type;
    }

    public void setType(QueryType type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Condition() {

    }

    public Condition(String field, QueryType type, Object value) {
        this.field = field;
        this.type = type;
        this.value = value;
    }

}
