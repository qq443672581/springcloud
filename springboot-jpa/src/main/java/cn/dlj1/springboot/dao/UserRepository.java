package cn.dlj1.springboot.dao;

import cn.dlj1.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findUsersByNameEquals(String name);

}
