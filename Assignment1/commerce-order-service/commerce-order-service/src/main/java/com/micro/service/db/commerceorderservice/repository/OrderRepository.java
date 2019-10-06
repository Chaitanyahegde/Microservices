package com.micro.service.db.commerceorderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.service.db.commerceorderservice.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
