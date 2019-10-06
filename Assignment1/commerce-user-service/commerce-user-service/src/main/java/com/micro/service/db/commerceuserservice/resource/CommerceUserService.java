package com.micro.service.db.commerceuserservice.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.service.db.commerceuserservice.model.Users;
import com.micro.service.db.commerceuserservice.repository.UserRepository;

@RestController
@RequestMapping("/rest/user")
public class CommerceUserService {

	UserRepository userRepository;
	
	public CommerceUserService(UserRepository orderRepository) {
		this.userRepository = orderRepository;			
	}
	
	@PostMapping("/add-user")
	public String addUser(Users user) {
		userRepository.save(user);
		return "success";
	}
}
