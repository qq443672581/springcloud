package cn.dlj1.boot.controller;

import cn.dlj1.boot.spring.plugin.AttachmentView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/")
@Controller
public class CoreController {

    @RequestMapping("")
    @ResponseBody
    public String index() {
        return "this is index!";
    }

    @RequestMapping(value = "/attachment", produces = "application/attachment")
    public String attachment(HttpServletRequest request){
        request.setAttribute("fileName","文本文件666.txt");
        request.setAttribute("content","文本文件666");
        return AttachmentView.name;
    }

}
