package cn.dlj1.ec.db.condition.common;

import cn.dlj1.ec.annotation.db.enums.CndType;
import cn.dlj1.ec.annotation.db.enums.OrderType;
import cn.dlj1.ec.db.condition.Cnd;

/**
 * 分页
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/19 22:26
 */
public class Limit implements Cnd {

    private int start;

    private int size;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public CndType getCndType() {
        return CndType.limit;
    }

    public Limit(int start, int size) {
        this.start = start;
        this.size = size;
    }
}
