package cn.dlj1.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@RestController
public class CoreController {

    @RequestMapping("")
    public String index() {
        return "this is index!";
    }

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String test() {
        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println("/info, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "666";
    }

}
