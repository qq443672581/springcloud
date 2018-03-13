package cn.dlj1.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 */
@SpringBootApplication
public class ECStart {

    public static void main(String[] args) {

        new SpringApplication(ECStart.class).run(args);

    }

}
