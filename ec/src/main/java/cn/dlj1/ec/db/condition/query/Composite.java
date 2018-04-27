package cn.dlj1.ec.db.condition.query;

import cn.dlj1.ec.db.types.QueryType;
import cn.dlj1.ec.db.condition.Query;

/**
 * 复合多条件
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/19 22:23
 */
public class Composite extends Query {

    private Query[] querys;

    public Query[] getQuerys() {
        return querys;
    }

    public void setQuerys(Query[] querys) {
        this.querys = querys;
    }

    public Composite(Query[] querys) {
        super(QueryType.AND);
        this.querys = querys;
    }
}
