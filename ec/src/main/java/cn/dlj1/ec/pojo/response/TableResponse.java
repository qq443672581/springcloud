package cn.dlj1.ec.pojo.response;

/**
 * 用于表格响应
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
public class TableResponse extends Response {

    public static final int DEFAULT_PAGE_SIZE = 20;

    public static final TableResponse NULL_DATA = new TableResponse(null, 0, 1, DEFAULT_PAGE_SIZE);

    private long count;

    private int now;

    private int size;

    private Object others;

    public TableResponse(String msg, Integer code) {
        super(msg, code);
        this.count = 0;
        this.now = 1;
        this.size = DEFAULT_PAGE_SIZE;
    }

    public TableResponse(String msg, Integer code, Object others) {
        this(msg, code);
        this.others = others;
    }

    public TableResponse(Object data, long count, int now, int size) {
        super(data);
        this.count = count;
        this.now = now;
        this.size = size;
    }

    public TableResponse(Object data, long count, int now, int size, Object others) {
        this(data, count, now, size);
        this.others = others;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public int getNow() {
        return now;
    }

    public void setNow(int now) {
        this.now = now;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object getOthers() {
        return others;
    }

    public void setOthers(Object others) {
        this.others = others;
    }
}
