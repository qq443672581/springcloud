package cn.dlj.boot.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;


@Configuration
@EnableTransactionManagement
public class TransactionConfig {
	
	@Bean
	@Primary
    public PlatformTransactionManager transactionManagerPrimary(DataSource ds) {
        return new DataSourceTransactionManager(ds);
    }
	
	@Bean
    public PlatformTransactionManager transactionManagerSecond(@Qualifier("dataSourceSecond") DruidDataSource ds) {
        return new DataSourceTransactionManager(ds);
    }
    
}
