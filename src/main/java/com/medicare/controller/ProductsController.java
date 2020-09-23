package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.medicare.model.Product;
import com.medicare.service.ProductsService;

@RestController
public class ProductsController {

	@Autowired
	private ProductsService service;

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/createProduct")
	public Product createProduct(@RequestBody Product product) {

		return service.createProduct(product);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/products")
	public List<Product> getAllProduct() {

		return service.getAllProduct();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/name")
	public List<Product> findByName(String name){
		return service.findByName(name);
	}

}
