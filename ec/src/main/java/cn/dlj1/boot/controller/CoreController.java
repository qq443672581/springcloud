package cn.dlj1.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/")
@Controller
public class CoreController {

    @RequestMapping("")
    @ResponseBody
    public String index() {
        return "this is index!";
    }


}
