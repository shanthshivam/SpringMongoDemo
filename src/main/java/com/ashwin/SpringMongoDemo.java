package com.ashwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringMongoDemo extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDemo.class, args);
	}

}
