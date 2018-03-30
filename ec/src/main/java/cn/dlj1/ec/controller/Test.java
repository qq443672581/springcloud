package cn.dlj1.ec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/3/18
 */
@Controller
public class Test {

    //@Autowired
    //private JdbcTemplate template;

    @RequestMapping("/")
    @ResponseBody
    public String index(String re){
        System.out.println("请求" + re + ":1");
        try {
            Thread.sleep(2000);
        }catch (Exception e){
        }
        System.out.println("请求" + re + ":2");
        return "666";
    }

}
