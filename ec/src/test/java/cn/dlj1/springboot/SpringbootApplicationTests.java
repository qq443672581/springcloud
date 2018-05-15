package cn.dlj1.springboot;

import cn.dlj1.ec.ECStart;
import cn.dlj1.ec.db.component.Limit;
import cn.dlj1.ec.db.component.Order;
import cn.dlj1.ec.db.sql.Insert;
import cn.dlj1.ec.db.sql.Sql;
import cn.dlj1.ec.db.types.OrderType;
import cn.dlj1.ec.pojo.entity.IdEntity;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ECStart.class)
public class SpringbootApplicationTests {

    public static void main(String[] args) {
        Sql insert = new Insert<IdEntity>()
                .addEntity(null)
                .addCnds(null)
                .addReturns(null)
                .addReturns(null)
                .setLimit(new Limit(1,1))
                .setOrder(new Order("id", OrderType.desc));

    }

}
