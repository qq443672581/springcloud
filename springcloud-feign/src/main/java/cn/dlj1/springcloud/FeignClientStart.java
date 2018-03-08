package cn.dlj1.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class FeignClientStart {

	public static void main(String[] args){
        new SpringApplicationBuilder(FeignClientStart.class).web(true).run(args);
	}

}
