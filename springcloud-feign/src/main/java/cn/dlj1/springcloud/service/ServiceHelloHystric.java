package cn.dlj1.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceHelloHystric implements ServiceHello {

    @Override
    public String hello(String name) {
        return "sorry service fail";
    }
}
