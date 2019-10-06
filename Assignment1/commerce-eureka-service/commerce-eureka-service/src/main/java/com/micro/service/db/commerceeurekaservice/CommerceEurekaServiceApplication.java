package com.micro.service.db.commerceeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CommerceEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommerceEurekaServiceApplication.class, args);
	}

}
