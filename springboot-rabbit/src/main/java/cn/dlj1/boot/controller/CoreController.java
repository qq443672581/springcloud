package cn.dlj1.boot.controller;

import cn.dlj1.boot.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

@RequestMapping("/")
@Controller
public class CoreController {

    @Autowired
    private Sender sender;

    @RequestMapping("")
    @ResponseBody
    public String index() {
        return "this is index!";
    }

    @RequestMapping("/send/{msg}")
    @ResponseBody
    public String send(@PathVariable(value = "msg") String msg) {
        sender.send(msg);
        return "success";
    }


}
