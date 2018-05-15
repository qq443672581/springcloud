package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.annotation.db.utils.TableUtils;
import cn.dlj1.ec.db.component.Cnd;
import cn.dlj1.ec.db.component.CndUtils;
import cn.dlj1.ec.db.component.Limit;
import cn.dlj1.ec.db.component.Order;
import cn.dlj1.ec.db.component.returns.Return;
import cn.dlj1.ec.pojo.entity.Entity;

/**
 * 创建一个Sql
 *
 * @param <T>
 */
public abstract class Sql<T extends Entity> implements SqlSuper<T>{

    private String sql;
    private Object[] params;

    // 创建sql对应的实体类型
    private Class<T> clazz;

    // 如果是insert update 需要的实体对象
    private Entity entity;

    // 需要返回的字段
    private Return[] returns;
    // 条件
    private Cnd[] cnds;
    // 排序
    private Order order;
    // 分页
    private Limit limit;

    public Sql<T> addEntity(T entity){
        if(!TableUtils.has(entity.getClass())){
            throw new RuntimeException("类型不正确!");
        }
        this.entity = entity;
        return this;
    }

    public Sql<T> addReturns(Return... returns){
        return this;
    }

    public Sql<T> addCnds(Cnd... cnds){
        this.cnds = CndUtils.add(this.cnds,cnds);
        return this;
    }

    @Override
    public Class<T> getClazz() {
        return clazz;
    }

    @Override
    public abstract void create();

    @Override
    public String getSql() {
        return sql;
    }

    @Override
    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public Return[] getReturns() {
        return returns;
    }

    public void setReturns(Return[] returns) {
        this.returns = returns;
    }

    public Cnd[] getCnds() {
        return cnds;
    }

    public void setCnds(Cnd[] cnds) {
        this.cnds = cnds;
    }

    public Order getOrder() {
        return order;
    }

    public Sql<T> setOrder(Order order) {
        this.order = order;
        return this;
    }

    public Limit getLimit() {
        return limit;
    }

    public Sql<T> setLimit(Limit limit) {
        this.limit = limit;
        return this;
    }
}
