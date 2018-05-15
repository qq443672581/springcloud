package cn.dlj1.ec.db.component;

import cn.dlj1.ec.db.types.CndType;
import cn.dlj1.ec.db.types.QueryType;

/**
 * 条件查询子类
 * Query
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/19 21:53
 */
public class Query implements Cnd {

    private QueryType queryType;

    @Override
    public QueryType getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryType queryType) {
        this.queryType = queryType;
    }

    public Query(QueryType queryType) {
        this.queryType = queryType;
    }

}
