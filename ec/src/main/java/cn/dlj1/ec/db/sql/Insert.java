package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.db.component.Cnd;
import cn.dlj1.ec.pojo.entity.Entity;
import cn.dlj1.ec.pojo.entity.IdEntity;

/**
 * 插入
 *
 * @param <T>
 */
public class Insert<T extends Entity> extends Sql<T>{

    @Override
    public boolean build() {
        return true;
    }
}
