package cn.dlj1.ec.annotation.db.enums;

/**
 * 表单
 * 控件类型
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年9月30日
 */
public enum WidgetType {

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

    WidgetType(String code, String name) {
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
