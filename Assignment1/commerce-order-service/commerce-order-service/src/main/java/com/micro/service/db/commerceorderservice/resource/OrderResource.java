package com.micro.service.db.commerceorderservice.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.service.db.commerceorderservice.model.Orders;
import com.micro.service.db.commerceorderservice.repository.OrderRepository;

@RestController
@RequestMapping("/rest/order")
public class OrderResource {
	OrderRepository orderRepository;
	
	public OrderResource(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;			
	}
	
	@PostMapping("/add-order")
	public String addOrder(Orders order) {
		orderRepository.save(order);
		return "success";
	}
}