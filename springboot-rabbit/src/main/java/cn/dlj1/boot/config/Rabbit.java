package cn.dlj1.boot.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Rabbit {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

}
