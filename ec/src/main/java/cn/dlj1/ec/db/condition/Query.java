package cn.dlj1.ec.db.condition;

import cn.dlj1.ec.annotation.db.enums.CndType;
import cn.dlj1.ec.annotation.db.enums.QueryType;

public class Query implements Cnd{

    @Override
    public CndType getCndType() {
        return null;
    }

    public QueryType getQueryType(){
        return null;
    }

}
