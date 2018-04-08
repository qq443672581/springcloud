package cn.dlj1.ec.pojo.entity;

/**
 * 系统内部公共类
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2017年11月21日
 */
public class BaseEntity implements Entity {

    public static final String TO_NULL_FIELD = "systemToEmptyFields";

    // 要制空的字段
    private String[] systemToEmptyFields;

    public String[] getSystemToEmptyFields() {
        return systemToEmptyFields;
    }

    public void setSystemToEmptyFields(String[] systemToEmptyFields) {
        this.systemToEmptyFields = systemToEmptyFields;
    }


}
