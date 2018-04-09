package cn.dlj1.ec.eql;

/**
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/9
 */
public class EqlResult {

    private boolean success;

    private String sql;

    private Object[] params;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }
}
