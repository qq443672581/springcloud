package cn.dlj1.ec.db.eql;

import cn.dlj1.ec.db.condition.Cnd;
import cn.dlj1.ec.db.condition.CndUtils;
import cn.dlj1.ec.db.returns.Return;
import cn.dlj1.ec.pojo.entity.Entity;

/**
 * EQL 对象级 sql生成工具类
 * 这里会包括 新增 修改 删除 查询
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
public class EQL {

    //分页默认每页数量
    public static final int EVERY_PAGE_SIZE = 20;

    public static EqlResult insert(Entity entity) {
        return null;
    }

    public static EqlResult delete(Class<Entity> clazz, Object ids) {
        return null;
    }

    public static EqlResult update(Entity entity, Object id) {
        return null;
    }

    /**
    * 查询
     *
     * 字段
     *
     * 条件
     * 排序
     * 分页
     *
    *
    * @auth fivewords(443672581@qq.com)
    * @date 2018/4/21 22:15
    */
    public static EqlResult query(Class<Entity> clazz, Return ret, Cnd cnd) {


        return null;
    }

    public static void main(String[] args) {
        query(Entity.class,null,CndUtils.and(null));
    }


}