package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.db.component.*;
import cn.dlj1.ec.db.component.returns.Return;
import cn.dlj1.ec.pojo.entity.Entity;

/**
 * sql查询接口
 *
 * @param <T>
 */
public interface SqlSuper<T extends Entity> {

    /**
     * 获取查询实体类型
     *
     * @return
     */
    Class<T> getClazz();

    /**
     * 根据本类已有属性,实现sql
     *
     * @return
     */
    boolean build();

    /**
     * 返回sql
     *
     * @return
     */
    String getSql();

    /**
     * 如果有参数 返回参数
     *
     * @return
     */
    Object[] getParams();

    /**
     * 添加需要转化的实体类
     *
     * @param entity
     * @return
     */
    Sql<T> addEntity(T entity);

    /**
     * 添加返回字段
     *
     * @param returns
     * @return
     */
    Sql<T> addReturns(Return... returns);

    /**
     * 添加条件
     *
     * @param cnds
     * @return
     */
    Sql<T> addCnds(Cnd... cnds);

    /**
     * 设置排序
     *
     * @param order
     * @return
     */
    Sql<T> setOrder(Order order);

    /**
     * 设置分页
     *
     * @param limit
     * @return
     */
    Sql<T> setLimit(Limit limit);

    /**
     * 添加分组
     *
     * @param groups
     * @return
     */
    Sql<T> addGroups(Group... groups);

}
