package cn.dlj1.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.dlj1.springboot.dao")
public class MyBatisStart {

	public static void main(String[] args){

		new SpringApplication(MyBatisStart.class).run(args);

	}

}
