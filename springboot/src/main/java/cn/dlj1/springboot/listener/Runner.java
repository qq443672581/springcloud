package cn.dlj1.springboot.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
    public void run(String... arg0) {
	}

}
