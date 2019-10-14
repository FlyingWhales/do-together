package com.doto.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.doto.entity")
public class DoTogetherApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoTogetherApplication.class, args);
	}

}
