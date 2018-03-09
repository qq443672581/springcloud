package cn.dlj1.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaServerCluster1Start {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerCluster1Start.class).web(true).run(args);
    }

}
