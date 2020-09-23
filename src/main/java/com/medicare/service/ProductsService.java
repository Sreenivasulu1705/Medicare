package com.medicare.service;

import java.util.List;

import com.medicare.model.Product;


public interface ProductsService {
	
	List<Product> findByName(String name);
	
	public Product createProduct(Product product);
	
	public List<Product> getAllProduct();

}
