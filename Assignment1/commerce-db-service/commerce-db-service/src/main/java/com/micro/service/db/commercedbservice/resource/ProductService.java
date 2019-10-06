package com.micro.service.db.commercedbservice.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.service.db.commercedbservice.model.Product;
import com.micro.service.db.commercedbservice.repository.ProductRepository;

@RestController
@RequestMapping("/rest/product")
public class ProductService {

	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		
		// Have this constructor to instantiate the repository. Else it would stay null.
		this.productRepository = productRepository;
	}
	
	@GetMapping("/get-all-products")
	public List<Product> getAllProducts(){
		
		// Get all products
		List<Product> products =productRepository.findAll();
		
		// Return all products
		return products;
	}
	
	@PostMapping("/save-product")
	public String saveProduct(Product product){
		
		productRepository.save(product);		
		return "success";
	}
}
