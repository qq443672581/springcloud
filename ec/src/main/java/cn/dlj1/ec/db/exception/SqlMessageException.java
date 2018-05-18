package cn.dlj1.ec.db.exception;

/**
 * sql错误消息异常
 *
 * 用于抛出可以直接用于用户的错误信息
 *
 */
public class SqlMessageException extends RuntimeException{

    public SqlMessageException(String message) {
        super(message);
    }
}
