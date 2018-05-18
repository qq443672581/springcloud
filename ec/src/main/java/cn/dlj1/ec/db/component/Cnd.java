package cn.dlj1.ec.db.component;

import cn.dlj1.ec.db.annotations.Form;

/**
 * 条件接口
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
public interface Cnd {

    Form.Query getQuery();

}
