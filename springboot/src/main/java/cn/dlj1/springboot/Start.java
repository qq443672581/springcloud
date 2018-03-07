package cn.dlj1.springboot;

import cn.dlj1.springboot.config.SpringApplicationWrap;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Start {

    public static void main(String[] args) {
        new SpringApplicationWrap(Start.class).run(args);
    }

}
