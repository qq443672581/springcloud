package cn.dlj1.ec.pojo.response;

import com.alibaba.fastjson.JSON;

/**
 * JSON 响应类
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
public class Response {

    public static final Response SUCCESS = new Response(null);

    public static final Response FAIL = new Response(null, null);

    private boolean success;

    private Integer code;

    private String msg;

    private Object data;

    public String toJson() {
        return JSON.toJSONString(this);
    }

    public static Response success(Object data) {
        return new Response(data);
    }

    public static Response fail(String msg) {
        return new Response(msg, null);
    }

    public void toFail(String msg, Integer... codes) {
        this.success = false;
        this.msg = msg;
        this.data = null;
        if (null != code) {
            this.code = codes[0];
        }
    }

    public Response(Object data) {
        this.success = true;
        this.data = data;
    }

    public Response(String msg, Integer code) {
        this.success = false;
        this.code = code;
        this.msg = msg;
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
