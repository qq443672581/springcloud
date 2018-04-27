package cn.dlj1.ec.db.types;

/**
 * 条件查询类型
 * <p>
 * equals not_equals like between
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年9月30日
 */
public enum QueryType {

    FALSE("", "", "不可查询"),

    EQUALS("=", "equals", "等于"),
    NOT_EQUALS("!=", "not_equals", "不等于"),

    GT(">", "gt", "大于"),
    GET(">=", "get", "大于等于"),
    LT("<", "lt", "小于"),
    LET("<=", "let", "小于等于"),

    LIKE("like", "like", "模糊查询"),
    START("like", "start", "开始于"),
    END("like", "end", "结束于"),

    AND("and", "and", "并且"),
    OR("or", "or", "或者"),
    BETWEEN("between", "between", "之间"),

    NULL("is null", "null", "是否为空"),

    NOT_IN("not in", "not_in", "不存在"),
    IN("in", "in", "存在于");

    /**
     * 复合条件
     */
    public static final QueryType[] compositeTypes = new QueryType[]{
            AND, OR
    };
    public static final String[] compositeTypesString = new String[]{
            AND.code, OR.code
    };


    /**
     * 是否是复合条件
     *
     * @param type
     * @return
     */
    public static boolean isCompoundCnd(QueryType type) {
        for (int i = 0; i < compositeTypes.length; i++) {
            if (compositeTypes[i] == type) {
                return true;
            }
        }
        return false;
    }

    /**
     * 通过查询代码 获取查询枚举类型
     *
     * @param en
     * @return
     */
    public static QueryType getType(String en) {
        switch (en) {

            case "equals":
                return QueryType.EQUALS;
            case "not_equals":
                return QueryType.NOT_EQUALS;
            case "gt":
                return QueryType.GT;
            case "get":
                return QueryType.GET;
            case "lt":
                return QueryType.LT;
            case "let":
                return QueryType.LET;
            case "like":
                return QueryType.LIKE;
            case "start":
                return QueryType.START;
            case "end":
                return QueryType.END;
            case "and":
                return QueryType.AND;
            case "or":
                return QueryType.OR;
            case "between":
                return QueryType.BETWEEN;
            case "in":
                return QueryType.IN;
            case "not_in":
                return QueryType.NOT_IN;
            case "null":
                return QueryType.NULL;
            default:
                return null;
        }
    }

    // 数据库代码
    private String code;
    // 英文解释
    private String en;
    // 中文解释
    private String cn;

    QueryType(String code, String en, String cn) {
        this.code = code;
        this.en = en;
        this.cn = cn;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

}
