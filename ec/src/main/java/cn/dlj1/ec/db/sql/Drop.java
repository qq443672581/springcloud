package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.db.entity.Entity;
import cn.dlj1.ec.db.exception.SqlBuildException;

/**
 * 删除表
 *
 * @param <T>
 */
public class Drop<T extends Entity> extends Sql<T>{

    @Override
    public Sql<T> build() throws SqlBuildException {

        return null;
    }

}
