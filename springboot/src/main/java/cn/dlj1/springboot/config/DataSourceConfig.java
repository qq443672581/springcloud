package cn.dlj1.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
@PropertySource("classpath:conf/db/db-${spring.profiles.active}.properties")
public class DataSourceConfig {

	@Bean
	public ServletRegistrationBean druidServlet() {
		ServletRegistrationBean reg = new ServletRegistrationBean();
		reg.setServlet(new StatViewServlet());
		reg.addUrlMappings("/druid/*");
		// reg.addInitParameter("loginUsername", username);
		// reg.addInitParameter("loginPassword", password);
		// reg.addInitParameter("logSlowSql", logSlowSql);
		return reg;
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new WebStatFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.addInitParameter("exclusions",
				"*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		filterRegistrationBean.addInitParameter("profileEnable", "true");
		return filterRegistrationBean;
	}
	
	/**
	 * 数据源 1
	 * @return
	 */
	@Primary
	@Bean(initMethod = "init", destroyMethod = "close")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DruidDataSource dataSourcePrimary() {
		return new DruidDataSource();
	}

	/**
	 * 数据源 2
	 * @return
	 */
	@Bean(initMethod = "init", destroyMethod = "close")
	@ConfigurationProperties(prefix = "spring.datasource.second")
	public DruidDataSource dataSourceSecond() {
		return new DruidDataSource();
	}

}