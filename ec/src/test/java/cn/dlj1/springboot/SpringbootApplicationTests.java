package cn.dlj1.springboot;

import cn.dlj1.ec.db.entity.TestEntity;
import cn.dlj1.ec.db.sql.Insert;
import cn.dlj1.ec.db.sql.Sql;
import org.junit.Test;

public class SpringbootApplicationTests {

    @Test
    public void test() {
        TestEntity test = new TestEntity();
        test.setName("ggg");

        Sql insert = new Insert<TestEntity>()
                .addEntity(test)
                .build();

        insert.getSql();
    }

}
