package com.micro.service.db.commerceorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories(basePackages="com.micro.service.db.commerceorderservice.repository")
@SpringBootApplication
public class CommerceOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommerceOrderServiceApplication.class, args);
	}

}
