package cn.dlj1.ec.db.condition;

import cn.dlj1.ec.enums.CndType;

/**
 * 条件接口
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
public interface Cnd {

    /**
     * 获取条件类型
     */
    CndType getCndType();

}
