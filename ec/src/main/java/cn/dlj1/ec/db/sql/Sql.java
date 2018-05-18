package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.db.component.Cnd;
import cn.dlj1.ec.db.component.Group;
import cn.dlj1.ec.db.component.Limit;
import cn.dlj1.ec.db.component.Order;
import cn.dlj1.ec.db.component.returns.Return;
import cn.dlj1.ec.db.exception.SqlBuildException;
import cn.dlj1.ec.db.utils.CndUtils;
import cn.dlj1.ec.db.utils.GroupUtils;
import cn.dlj1.ec.db.utils.ReturnUtils;
import cn.dlj1.ec.db.entity.Entity;
import org.hibernate.validator.internal.util.privilegedactions.NewJaxbContext;

/**
 * 创建一个Sql
 * 仅仅用于单表查询
 *
 * insert into table(a,b,c) value(?,?,?)    ： 实体
 * delete from table where id = ?           ： 类型、条件
 * update table set a = ? where id = ?      ： 类型、
 * select id,a,b,c from table where id = ?
 *
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
    // 分组
    private Group[] groups;

    @Override
    public void replaceSql(String oldChar, String newChar) {
        this.sql = this.sql.replace(oldChar, newChar);
    }

    @Override
    public abstract Sql<T> build() throws SqlBuildException;

    public Sql<T> addEntity(T entity){
        this.entity = entity;
        return this;
    }

    @Override
    public Sql<T> addReturns(Return... returns) {
        this.returns = ReturnUtils.add(this.returns, returns);
        return this;
    }

    @Override
    public Sql<T> addCnds(Cnd... cnds) {
        this.cnds = CndUtils.add(this.cnds, cnds);
        return this;
    }

    @Override
    public Sql<T> addGroups(Group... groups) {
        this.groups = GroupUtils.add(this.groups, groups);
        return this;
    }

    @Override
    public Sql<T> setLimit(Limit limit) {
        this.limit = limit;
        return this;
    }

    @Override
    public Sql<T> setOrder(Order order) {
        this.order = order;
        return this;
    }

    @Override
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public void setParams(int index, Object param) {
        this.params[index] = param;
    }

    @Override
    public Class<T> getClazz() {
        return clazz;
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

    public Limit getLimit() {
        return limit;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
}
