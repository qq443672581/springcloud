package cn.dlj1.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class CoreController {

    @RequestMapping("")
    public String index() {
        return "this is index!";
    }

}
