package cn.dlj1.springboot;

import cn.dlj1.ec.ECStart;
import cn.dlj1.ec.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ECStart.class)
public class SpringbootApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    public void contextLoads() {

        System.out.println(testService.go());

    }

}
