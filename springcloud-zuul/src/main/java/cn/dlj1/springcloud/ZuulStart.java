package cn.dlj1.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulStart {

	public static void main(String[] args){
        new SpringApplicationBuilder(ZuulStart.class).web(true).run(args);
	}

}
