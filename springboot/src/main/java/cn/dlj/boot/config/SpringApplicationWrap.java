package cn.dlj.boot.config;

import org.springframework.boot.SpringApplication;

/**
 * 对启动类的包装
 * 
 * @author fivewords(443672581@qq.com)
 * @dateTime 2018年3月4日
 */
public class SpringApplicationWrap extends SpringApplication {

	public SpringApplicationWrap(Class<?> clazz) {
		super(clazz);
	}
}
