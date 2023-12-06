package com.ninja.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication

@ComponentScan(basePackages = "com.ninja.demo")
@EnableJpaRepositories
@EntityScan

public class NnAssignment3LmsDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(NnAssignment3LmsDbApplication.class, args);
		System.out.println("*************Nimoy-Ninja Assignment for Restoration of LMS_DB********************");
	}

}
