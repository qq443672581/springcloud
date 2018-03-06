package cn.dlj.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.dlj.boot.config.SpringApplicationWrap;

@SpringBootApplication(exclude={
		//org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration.class
})
public class Start {

	public static void main(String[] args) {
		new SpringApplicationWrap(Start.class).run(args);
	}

}
