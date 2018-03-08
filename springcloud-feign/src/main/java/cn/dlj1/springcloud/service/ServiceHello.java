package cn.dlj1.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "EUREKA-CLIENT",fallback = ServiceHelloHystric.class)
public interface ServiceHello {

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);

}
