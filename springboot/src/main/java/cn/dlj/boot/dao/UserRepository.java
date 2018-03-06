package cn.dlj.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.dlj.boot.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
