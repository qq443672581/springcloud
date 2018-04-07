package cn.dlj1.ec.controller;

import cn.dlj1.ec.annotation.auth.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 为了让菜单结构更加鲜明<br>
 * 每个没有请求的模块需要继承本类
 *
 * @author fivewords(443672581 @ qq.com)
 * @date 2018年4月7日
 */
public class NoRequestController {

    @Menu("")
    @RequestMapping
    @ResponseBody
    public String no(HttpServletRequest request) {
        return "no message";
    }

}
