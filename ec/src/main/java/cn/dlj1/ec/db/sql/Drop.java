package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.db.entity.Entity;
import cn.dlj1.ec.db.exception.SqlBuildException;

/**
 * 删除表
 *
 */
public class Drop extends Sql{

    @Override
    public Sql build() throws SqlBuildException {

        return null;
    }

    Drop(Class<? extends Entity> clazz){
        super(clazz);
    }

}
