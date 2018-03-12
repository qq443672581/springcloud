package cn.dlj1.springcloud.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

    @Configuration
    @EnableOAuth2Sso
    @EnableAutoConfiguration
    public class BigSecurityConfig extends WebSecurityConfigurerAdapter {
    }
