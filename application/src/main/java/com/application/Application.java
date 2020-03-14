package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.plugin.Contract;

@SpringBootApplication
@ComponentScan(basePackages= "com.plugin")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public Contract contract() {
		return () -> {
			return "hello from application";
		};
	}

}
