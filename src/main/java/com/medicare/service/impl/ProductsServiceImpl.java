package com.medicare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.model.Product;
import com.medicare.repository.ProductsRepository;
import com.medicare.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService{
	
	@Autowired
	private ProductsRepository repository;

	@Override
	public List<Product> findByName(String name) {
		
		return repository.findByName(name);
	}

	@Override
	public Product createProduct(Product product) {
		
		return repository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return repository.findAll();
	}

}
