package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.annotation.db.utils.TableUtils;
import cn.dlj1.ec.db.condition.Cnd;
import cn.dlj1.ec.db.returns.Return;
import cn.dlj1.ec.pojo.entity.Entity;

/**
 * 创建一个Sql
 *
 * @param <T>
 */
public class Sql<T extends Entity> implements SqlSuper<T>{

    // 创建sql对应的实体类型
    private Class<T> clazz;

    // 如果是insert update 需要的实体对象
    private Entity entity;

    // 需要返回的字段
    private Return[] returns;
    // 条件
    private Cnd[] cnds;

    public Sql addEntity(T entity){
        if(!TableUtils.has(entity.getClass())){
            throw new RuntimeException("类型不正确!");
        }
        this.entity = entity;
        return this;
    }

    public Sql addReturns(Return re){
        return this;
    }

    public Sql addCnds(Cnd cnd){
        return this;
    }

    @Override
    public Class<T> getClazz() {
        return clazz;
    }

    @Override
    public void create() {

    }

    @Override
    public String getSql() {
        return null;
    }

    @Override
    public Object[] getParams() {
        return null;
    }

}
