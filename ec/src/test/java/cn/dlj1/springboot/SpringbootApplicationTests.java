package cn.dlj1.springboot;

import cn.dlj1.ec.db.entity.TestEntity;
import cn.dlj1.ec.db.sql.Insert;
import cn.dlj1.ec.db.sql.Sql;
import org.junit.Test;

import java.util.Arrays;

public class SpringbootApplicationTests {

    @Test
    public void test() {
        TestEntity test = new TestEntity();
        test.setName("ggg");
        test.setId(66);

        long time = System.currentTimeMillis();
        Sql insert = new Insert()
                .addEntity(test)
                .build();
        System.out.println("time:" + (System.currentTimeMillis() - time));

        System.out.println(insert.getSql());
        System.out.println(Arrays.toString(insert.getParams()));
    }

}
