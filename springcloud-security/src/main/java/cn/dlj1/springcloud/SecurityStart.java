package cn.dlj1.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
//@EnableAuthorizationServer
//@EnableOAuth2Sso
public class SecurityStart {

	public static void main(String[] args){

		new SpringApplication(SecurityStart.class).run(args);

	}

}
