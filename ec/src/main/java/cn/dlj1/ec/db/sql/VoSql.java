package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.db.component.Cnd;
import cn.dlj1.ec.pojo.entity.Entity;

/**
 select u.id id,u.name name from user u left join user_extend ue on u.id = ue.userId
 where @(where u.id id) and @(where u.name name)
 */

/**
 * 用于VO类型的sql模板
 *
 *
 * @param <T>
 */
public class VoSql<T extends Entity> implements SqlSuper<T> {

    // 类型
    private Class<T> clazz;
    private String sql;
    private Object[] params;

    private Cnd[] cnds;

    public VoSql(String sql){
        this.sql = sql;
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
        return this.sql;
    }

    @Override
    public Object[] getParams() {
        return this.params;
    }
}
