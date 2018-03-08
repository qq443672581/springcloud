package cn.dlj1.springcloud.controller;

import cn.dlj1.springcloud.service.ServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class CoreController {

    @Autowired
    ServiceHello serviceHello;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String info(){
        return "info ";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam String name){
        return serviceHello.hello(name);
    }


}
