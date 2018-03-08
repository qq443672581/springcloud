package cn.dlj1.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerStart {

	public static void main(String[] args){
        new SpringApplicationBuilder(ConfigServerStart.class).web(true).run(args);
	}

}
