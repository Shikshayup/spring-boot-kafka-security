package com.springboot.security.service;

import java.util.List;

import com.springboot.security.entity.Product;

public interface ProductService {
	 
	public Product getProdById(int id);
	public List<Product> getProducts();
	
}
