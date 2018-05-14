package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.pojo.entity.Entity;

/**
 * sql接口
 *
 * @param <T>
 */
public interface SqlSuper<T extends Entity> {

    Class<T> getClazz();

    void create();

    String getSql();

    Object[] getParams();

}
