package cn.dlj1.ec.db.condition.impl;

import cn.dlj1.ec.annotation.db.enums.QueryType;
import cn.dlj1.ec.db.condition.Cnd;
import cn.dlj1.ec.db.condition.CndUtils;
import cn.dlj1.ec.db.condition.Query;

/**
 * 多条件
 * 用于 and or between <br>
 *
 * @author fivewords(443672581 @ qq.com)
 * @dateTime 2017年11月15日
 */
public class Conditions extends Query {

    private QueryType type;

    private Cnd[] cnds;

    @Override
    public QueryType getQueryType() {
        return super.getQueryType();
    }

    public Cnd[] getCnds() {
        return cnds;
    }

    public void setCnds(Cnd[] cnds) {
        this.cnds = cnds;
    }

    public Conditions() {

    }

    public Conditions(QueryType type) {
        super();
        this.type = type;
    }

    public Conditions(QueryType type, Cnd[] cnds) {
        super();
        this.type = type;
        this.cnds = cnds;
    }

    public void add(Cnd cnd) {
        this.cnds = CndUtils.add(this.cnds, cnd);
    }


}
