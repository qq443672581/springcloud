package cn.dlj1.ec.db.resolve;

import cn.dlj1.ec.db.condition.Cnd;
import cn.dlj1.ec.db.returns.Return;
import cn.dlj1.ec.pojo.entity.Entity;

/**
 * sql拼接 解析器
 *
 */
public class DeCode {

    private static final String insert = "insert into @table_name(@fields) value(@value)";

    private Return returns;
    private Entity entity;
    private Cnd cnds;

}
