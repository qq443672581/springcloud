package cn.dlj1.springboot.service;

import cn.dlj1.springboot.dao.CoreDao;
import cn.dlj1.springboot.dao.UserRepository;
import cn.dlj1.springboot.entity.Book;
import cn.dlj1.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class JpaService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
    private JdbcTemplate jdbcTemplate;

	public User add(){

        User user = new User();
        user.setName("张三");

        Book book = new Book();
        book.setName("Java");

        List<Book> list = new ArrayList<Book>();
        list.add(book );
        user.setBooks(list);
        userRepository.save(user);

        User user2 = new User();
        user2.setName("张三");


        return userRepository.save(user2);

    }

    public User add3(){
        jdbcTemplate.update("INSERT INTO user(name) value('张三')" );

        return new User();

    }
}
