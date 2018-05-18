package cn.dlj1.ec.db.entity;

import cn.dlj1.ec.db.annotations.*;

@Table(name = "测试", value = "test")
@Index({
        @Index.Item(name = "name", fields = "name")
})
public class TestEntity extends IdEntity {

    @Column(name = "姓名", length = 8)
    @Form
    @Rules
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
