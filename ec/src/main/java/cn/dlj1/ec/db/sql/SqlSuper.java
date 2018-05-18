package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.db.component.*;
import cn.dlj1.ec.db.component.returns.Return;
import cn.dlj1.ec.db.exception.SqlBuildException;
import cn.dlj1.ec.db.entity.Entity;

/**
 * sql查询接口
 *
 * 一切操作都应该依托实体来进行
 *
 */
public interface SqlSuper {

    /**
     * 获取查询实体类型
     *
     * @return
     */
    Class<? extends Entity> getClazz();

    /**
     * sql替换
     *
     * @param oldChar
     * @param newChar
     */
    void replaceSql(String oldChar, String newChar);

    /**
     * 根据本类已有属性,实现组装sql
     * 如果在build的时候出错，那么要抛出异常
     *
     * @return
     */
    Sql build() throws SqlBuildException;

    /**
     * 返回sql
     * build前为空
     *
     * @return
     */
    String getSql();

    /**
     * 如果有参数 返回参数
     * build之前返回空
     *
     * @return
     */
    Object[] getParams();

    /**
     * insert、update 操作时，添加需要转化的实体
     *
     * @param entity
     * @return
     */
    Sql addEntity(Entity entity);

    /**
     * 添加返回字段
     *
     * @param returns
     * @return
     */
    Sql addReturns(Return... returns);

    /**
     * 添加条件
     *
     * @param cnds
     * @return
     */
    Sql addCnds(Cnd... cnds);

    /**
     * 设置排序
     *
     * @param order
     * @return
     */
    Sql setOrder(Order order);

    /**
     * 设置分页
     *
     * @param limit
     * @return
     */
    Sql setLimit(Limit limit);

    /**
     * 添加分组
     *
     * @param groups
     * @return
     */
    Sql addGroups(Group... groups);

}
