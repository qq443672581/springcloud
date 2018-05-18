package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.db.entity.Entity;
import cn.dlj1.ec.db.exception.SqlBuildException;

/**
 * 创建表
 *
 */
public class Create extends Sql{

    @Override
    public Sql build() throws SqlBuildException {

        return null;
    }

    Create(Class<? extends Entity> clazz){
        super(clazz);
    }
}
