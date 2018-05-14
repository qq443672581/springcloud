package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.db.condition.Cnd;
import cn.dlj1.ec.pojo.entity.Entity;

/**
 * 插入
 *
 * @param <T>
 */
public class Insert<T extends Entity> extends Sql<T>{

    @Override
    public Sql addEntity(T entity) {
        return super.addEntity(entity);
    }

    @Override
    public Sql addCnds(Cnd cnd) {
        return super.addCnds(cnd);
    }
}
