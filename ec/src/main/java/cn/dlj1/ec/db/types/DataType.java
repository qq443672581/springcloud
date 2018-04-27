package cn.dlj1.ec.db.types;

/**
 * 数据库
 * 字段类型
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年9月30日
 */
public enum DataType {

    INT("int", "整型"),
    BIGINT("bigint", "长整型"),
    FLOAT("float", "浮点型"),
    VARCHAR("varchar", "字符"),
    TEXT("text", "文本"),
    DATETIME("datetime", "时间日期"),
    DATE("date", "日期"),
    TIME("time", "时间");


    private String code;
    private String name;

    DataType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
