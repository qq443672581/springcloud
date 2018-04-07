package cn.dlj1.ec.config;

import cn.dlj1.ec.db.Jdbc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
@Configuration
public class JdbcConfig {

    @Bean(name = "systemJdbc")
    public Jdbc systemJdbc() {
        return new Jdbc();
    }

}
