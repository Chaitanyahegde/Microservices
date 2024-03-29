package com.micro.service.db.commerceuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories(basePackages="com.micro.service.db.commerceuserservice.repository")
@SpringBootApplication
public class CommerceUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommerceUserServiceApplication.class, args);
	}

}
