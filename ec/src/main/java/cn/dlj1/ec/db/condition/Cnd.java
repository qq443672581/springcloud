package cn.dlj1.ec.db.condition;

import cn.dlj1.ec.annotation.db.enums.QueryType;

/**
 * 条件接口
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
public interface Cnd {

    QueryType getType();

}
