package cn.dlj1.ec.db.component;

import cn.dlj1.ec.db.annotations.Form;

/**
 * 条件查询子类
 * Query
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/19 21:53
 */
public class Query implements Cnd {

    private Form.Query query;

    @Override
    public Form.Query getQuery() {
        return query;
    }

    public void setQuery(Form.Query query) {
        this.query = query;
    }

    public Query(Form.Query query) {
        this.query = query;
    }

}
