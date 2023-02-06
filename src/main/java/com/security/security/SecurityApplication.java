package com.security.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.security.security.config.LoginSuccessHandler;

@SpringBootApplication
@ComponentScan(basePackages = "com.security.security.*")
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	
	
}
