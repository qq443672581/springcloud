package cn.dlj1.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class CoreController {

    @Value("${message}")
    public String message;

    @RequestMapping("")
    public String index() {
        return String.format("This Is Message From Github: %s",message);
    }

}
