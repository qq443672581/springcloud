package cn.dlj1.ec;

import cn.dlj1.ec.config.SpringbootApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;

/**
 * 启动类
 * @date 2018年4月7日
 */
@SpringBootApplication(
        exclude = {
                DataSourceAutoConfiguration.class,
                TransactionAutoConfiguration.class,
                JdbcTemplateAutoConfiguration.class
        }
)
public class ECStart extends SpringbootApplicationConfig {

    public static void main(String[] args) {

        new SpringApplication(ECStart.class).run(args);

    }

}
