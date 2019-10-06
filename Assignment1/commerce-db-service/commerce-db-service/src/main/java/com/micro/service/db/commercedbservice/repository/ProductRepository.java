package com.micro.service.db.commercedbservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.service.db.commercedbservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
