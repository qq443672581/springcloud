package cn.dlj1.ec.config;

import cn.dlj1.ec.filter.BaseFilter;
import cn.dlj1.ec.interceptor.AuthInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 基础配置
 */
public class SpringbootApplicationConfig extends WebMvcConfigurerAdapter {

    /**
     * 拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/**");

        super.addInterceptors(registry);
    }

    /**
     * 过滤器
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean baseFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new BaseFilter());
        registration.addUrlPatterns("/");
        return registration;
    }

}
