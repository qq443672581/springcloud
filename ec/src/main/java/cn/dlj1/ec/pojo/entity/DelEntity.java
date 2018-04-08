package cn.dlj1.ec.pojo.entity;

/**
 * 基础的实体类
 * <p>
 * 带有假删除字段的基础类
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年10月13日
 */
public class DelEntity extends IdEntity {

    private int isDel;

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

}
