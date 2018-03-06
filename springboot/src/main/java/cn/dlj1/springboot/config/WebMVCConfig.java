package cn.dlj1.springboot.config;

import java.util.List;

import cn.dlj1.springboot.interceptor.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@Configuration
public class WebMVCConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private WebApplicationContext web;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new Interceptor()).addPathPatterns("/**");
		
		super.addInterceptors(registry);
	}
	
	@Override
	public void configureMessageConverters(
			List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		//返回数据format
		fastConverter.setFeatures(
				SerializerFeature.PrettyFormat
			);
		converters.add(fastConverter);
	}

}
