package cn.dlj1.ec.db.condition.common;

import cn.dlj1.ec.enums.CndType;
import cn.dlj1.ec.enums.OrderType;
import cn.dlj1.ec.db.condition.Cnd;

/**
 * 条件 排序
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/19 22:26
 */
public class Order implements Cnd {

    private String field;

    private OrderType orderType;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public Order(String field, OrderType orderType) {
        this.field = field;
        this.orderType = orderType;
    }

    public Order(String field) {
        this(field, OrderType.desc);
    }

    @Override
    public CndType getCndType() {
        return CndType.order;
    }


}
