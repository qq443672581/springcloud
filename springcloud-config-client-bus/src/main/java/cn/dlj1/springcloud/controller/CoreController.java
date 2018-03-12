package cn.dlj1.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class CoreController {

    @Autowired
    private Environment environment;

    @RequestMapping("")
    public String index() {

        return String.format("This Is Message From Github: %s",environment.getProperty("message"));
    }

}
