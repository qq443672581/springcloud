package cn.dlj1.ec.db.component;

import cn.dlj1.ec.db.types.CndType;
import cn.dlj1.ec.db.types.OrderType;
import cn.dlj1.ec.pojo.entity.Entity;

/**
 * 条件 排序
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/19 22:26
 */
public class Order {

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

    public Order(String field, String orderType) {
        this(field, "desc".equals(orderType) ? OrderType.desc : OrderType.asc);
    }

    public Order(Class<? extends Entity> clazz, String field, OrderType orderType) {
        this(field, orderType);
    }

    public Order(Class<? extends Entity> clazz, String field, String orderType) {
        this(field, orderType);
    }

    public Order(String field) {
        this(field, OrderType.desc);
    }

}
