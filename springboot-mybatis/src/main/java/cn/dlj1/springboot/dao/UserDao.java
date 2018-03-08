package cn.dlj1.springboot.dao;

import cn.dlj1.springboot.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    List<User> selectAll();

    User selectOne(int id);

    int add(User user);

}
