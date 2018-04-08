package cn.dlj1.ec.pojo.entity;

/**
 * 具有创建人，修改人，时间记录的实体
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年11月9日17:08:48
 */
public class UserEntity extends DateEntity {

    private Integer createAdmin;

    private Integer updateAdmin;

    public Integer getCreateAdmin() {
        return createAdmin;
    }

    public void setCreateAdmin(Integer createAdmin) {
        this.createAdmin = createAdmin;
    }

    public Integer getUpdateAdmin() {
        return updateAdmin;
    }

    public void setUpdateAdmin(Integer updateAdmin) {
        this.updateAdmin = updateAdmin;
    }

}
