package cn.dlj1.ec.db.sql;

import cn.dlj1.ec.db.entity.Entity;

/**

 select u.id id,u.name name from user u left join user_extend ue on u.id = ue.userId
 where @(where u.id id) and @(where u.name name)
 group by @(group u.id id) order by @(order u.id id) @(limit)

 */

/**
 * 用于VO类型的sql模板
 * 主要通过关键词替换来实现
 * 关键词:
 *  简单：
 *  @(return sqlField searchField)
 *  @(where sqlField searchField)
 *  @(group sqlField searchField)
 *  @(order sqlField searchField)
 *  @(limit)
 *  复合：
 *  @(returns)
 *  @(wheres)
 *
 *
 */
public interface VoSql extends SqlSuper {



}
