package cn.dlj1.springcloud.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {

    @RequestMapping("")
    public String index() {
        return "this is index!";
    }

    @RequestMapping("/order/{id}")
    public String order(@PathVariable String id) {
        return "this is " + id;

    }

    @RequestMapping("/product/{id}")
    public String product(@PathVariable String id) {
        return "this is " + id;
    }


}
