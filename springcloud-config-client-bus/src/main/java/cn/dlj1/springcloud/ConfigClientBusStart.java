package cn.dlj1.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConfigClientBusStart {

	public static void main(String[] args){
        new SpringApplicationBuilder(ConfigClientBusStart.class).web(true).run(args);
	}

}
