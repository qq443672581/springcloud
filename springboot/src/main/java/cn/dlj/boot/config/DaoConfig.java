package cn.dlj.boot.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DaoConfig {

	@Bean
	@Primary
	public JdbcTemplate jdbcTemplatePrimary(@Autowired DataSource ds) {
		return new JdbcTemplate(ds);
	}
	
	@Bean
	public JdbcTemplate jdbcTemplateSecond(@Qualifier("dataSourceSecond") DruidDataSource ds) {
		return new JdbcTemplate(ds);
	}

}