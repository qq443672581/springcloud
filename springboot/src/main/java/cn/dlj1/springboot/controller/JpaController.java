package cn.dlj1.springboot.controller;

import cn.dlj1.springboot.dao.UserRepository;
import cn.dlj1.springboot.dao2.UserRepository2;
import cn.dlj1.springboot.entity.Book;
import cn.dlj1.springboot.entity.User;
import cn.dlj1.springboot.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/jpa")
@Controller
public class JpaController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JpaService jpaService;

    @Autowired
    private UserRepository2 userRepository2;

    @RequestMapping("/1")
    @ResponseBody
    public List<User> json1() {
        return userRepository.findAll();
    }

    @RequestMapping("/2")
    @ResponseBody
    public List<User> json2() {
        return userRepository2.findAll();
    }

    @RequestMapping("/3")
    @ResponseBody
    public List<User> json3() {
        return userRepository.findAll();
    }

    @RequestMapping("/add")
    @ResponseBody
    public User add() {
        return jpaService.add3();
    }

}
