package cn.dlj1.ec.db.entity;

import cn.dlj1.ec.db.annotations.Column;
import cn.dlj1.ec.db.annotations.Form;
import cn.dlj1.ec.db.annotations.Index;
import cn.dlj1.ec.db.annotations.Rules;

/**
 * 基础的实体类
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2016年9月29日
 */
@Index({
        @Index.Item(name = "pk", fields = "id")
})
public class IdEntity extends BaseEntity {

    @Column(name = "主键", type = Column.Type.INT, autoAdd = true, commont = "表主键")
    @Form(widght = Form.Widget.TXT)
    @Rules(isInsert = false, isUpdate = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
