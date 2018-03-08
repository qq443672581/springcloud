package cn.dlj1.springboot.controller;

import cn.dlj1.springboot.dao.UserDao;
import cn.dlj1.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
public class CoreController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("")
    public  String index() {
        return "this is index!";
    }

    @RequestMapping("/all")
    public List<User> selectAll(){
        return userDao.selectAll();
    }

    @RequestMapping("/one")
    public User selectOne(int id){
        return userDao.selectOne(id);
    }

    @RequestMapping("/add")
    public int add(User user){
        return userDao.add(user);
    }



}
