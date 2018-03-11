package cn.dlj1.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitStart {

    public static void main(String[] args) {

        new SpringApplication(RabbitStart.class).run(args);

    }

}
