package cn.dlj1.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.dlj1.springboot.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
