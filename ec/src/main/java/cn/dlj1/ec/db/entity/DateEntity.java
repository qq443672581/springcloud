package cn.dlj1.ec.db.entity;

import java.util.Date;

/**
 * 具有时间记录的实体
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年11月9日17:08:48
 */
public class DateEntity extends IdEntity {

    private Date createDate;

    private Date updateDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
