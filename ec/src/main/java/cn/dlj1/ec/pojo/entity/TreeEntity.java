package cn.dlj1.ec.pojo.entity;

import java.util.List;

/**
 * 树控件需要继承此类
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2018年1月4日
 */
public class TreeEntity extends IdEntity {

    private List<Object> children;

    public List<Object> getChildren() {
        return children;
    }

    public void setChildren(List<Object> children) {
        this.children = children;
    }
}
