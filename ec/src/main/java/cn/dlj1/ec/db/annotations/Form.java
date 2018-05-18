package cn.dlj1.ec.db.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 应用于表单
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年9月30日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Form {

    /**
     * 表单控件的类型<br>
     */
    Widget widght() default Widget.TEXT;

    /**
     * 查询类型<br>
     *
     */
    Query query() default Query.EQUALS;

    /**
     * 控件类型
     */
    enum Widget {

        TXT("txt", "文本"),//展示型文本,不可修改
        TEXT("text", "文本框"),
        NUMBER("number", "数值框"),
        PASSWORD("password", "密码框"),
        HIDDEN("hidden", "隐藏域"),
        RADIO("radio", "单选框"),
        SWITCH("switch", "开关"),
        CHECKBOX("checkbox", "多选框"),
        SELECT("select", "下拉"),
        REMOTE("remote", "远程"),
        TEXTAREA("textarea", "文本域"),
        EDITOR("editor", "编辑器"),
        DATETIME("datetime", "日期时间"),
        DATE("date", "日期"),
        TIME("time", "时间"),

        IMAGE("image", "图片"),
        IMAGES("images", "多图"),
        FILE("file", "文件"),
        FILES("files", "多文件");

        private String code;
        private String name;

        Widget(String code, String name) {
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

    enum Query {

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

        NOT_IN("not in", "not_in", "不存在于"),
        IN("in", "in", "存在于");

        /**
         * 复合条件
         */
        public static final Query[] compositeTypes = new Query[]{
                AND, OR
        };
        /**
         * 复合条件
         */
        public static final String[] compositeTypesString = new String[]{
                AND.code, OR.code
        };


        /**
         * 是否是复合条件
         *
         * @param type
         * @return
         */
        public static boolean isCompoundCnd(Query type) {
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
        public static Query getType(String en) {
            switch (en) {

                case "equals":
                    return EQUALS;
                case "not_equals":
                    return NOT_EQUALS;
                case "gt":
                    return GT;
                case "get":
                    return GET;
                case "lt":
                    return LT;
                case "let":
                    return LET;
                case "like":
                    return LIKE;
                case "start":
                    return START;
                case "end":
                    return END;
                case "and":
                    return AND;
                case "or":
                    return OR;
                case "between":
                    return BETWEEN;
                case "in":
                    return IN;
                case "not_in":
                    return NOT_IN;
                case "null":
                    return NULL;
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

        Query(String code, String en, String cn) {
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
    
}
