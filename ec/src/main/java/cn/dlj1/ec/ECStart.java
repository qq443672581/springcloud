package cn.dlj1.ec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * 启动类
 */
@SpringBootApplication(
        exclude = {
                DataSourceAutoConfiguration.class,
                TransactionAutoConfiguration.class,
                JdbcTemplateAutoConfiguration.class
        }
)
public class ECStart {

    public static void main(String[] args) {

        new SpringApplication(ECStart.class).run(args);

    }

}
