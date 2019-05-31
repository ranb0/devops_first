package com.devops.poc.spr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@EntityScan(basePackages= {"com.devops.poc.spr.model"})
public class SprApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprApplication.class, args);
	}

}
