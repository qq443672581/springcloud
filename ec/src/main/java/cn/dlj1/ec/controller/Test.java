package cn.dlj1.ec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

/**
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/3/18
 */
@Controller
public class Test {

    @Autowired
    private JdbcTemplate template;


}
