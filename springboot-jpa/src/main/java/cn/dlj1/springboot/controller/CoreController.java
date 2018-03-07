package cn.dlj1.springboot.controller;

import cn.dlj1.springboot.dao.UserRepository;
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
    private UserRepository userRepository;

    @RequestMapping("")
    public String index() {
        return "this is index!";
    }

    @RequestMapping("/list")
    public List<User> list() {
        return userRepository.findAll();
    }

    @RequestMapping("/add")
    public User add(){
        return userRepository.save(new User("张三",12,5));
    }

    @RequestMapping("/edit")
    public User edit(String name, int id){
        User user = new User("张三",12,5);
        user.setName(name);
        user.setId(id);
        return userRepository.save(user);
    }

    @RequestMapping("/get")
    public User get(long id){
        return userRepository.getOne(id);
    }

    @RequestMapping("/del")
    public String del(long id){
        userRepository.delete(id);
        return "success";
    }

    @RequestMapping("/find")
    public User find(String name){
        return userRepository.findUsersByNameEquals(name);
    }


}
