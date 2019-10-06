package com.micro.service.db.commerceuserservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.service.db.commerceuserservice.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

	
	
}
