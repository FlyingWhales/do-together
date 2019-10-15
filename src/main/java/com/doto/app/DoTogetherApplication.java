package com.doto.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.doto.entity")
@EnableJpaRepositories(basePackages = "com.doto.repository")
public class DoTogetherApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoTogetherApplication.class, args);
	}

}
