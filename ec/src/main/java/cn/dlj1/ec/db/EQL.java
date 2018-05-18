package cn.dlj1.ec.db;

import cn.dlj1.ec.db.component.Cnd;
import cn.dlj1.ec.db.component.returns.Return;
import cn.dlj1.ec.db.entity.Entity;
import cn.dlj1.ec.db.sql.Insert;
import cn.dlj1.ec.db.sql.SqlSuper;

/**
 * EQL 对象级 sql生成工具类
 * 这里会包括 新增 修改 删除 查询
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
public class EQL {

    private static final Impl impl = new Impl();

    //分页默认每页数量
    public static final int EVERY_PAGE_SIZE = 20;

    public static SqlSuper insert(Entity entity) {
        return impl.insert(entity);
    }

    public static SqlSuper delete(Class clazz, Object ids) {
        return null;
    }

    public static SqlSuper update(Entity entity, Object id) {
        return null;
    }

    public static SqlSuper query(Class clazz, Return ret, Cnd cnd) {
        return null;
    }


}

class Impl {

    public SqlSuper insert(Entity entity) {
        return new Insert(entity.getClass())
                .addEntity(entity)
                .build();
    }

}