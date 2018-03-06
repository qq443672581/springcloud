package cn.dlj1.springboot.dao2;

import cn.dlj1.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository2 extends JpaRepository<User, Long> {

}
