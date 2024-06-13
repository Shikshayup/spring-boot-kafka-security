package com.springboot.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.security.entity.Product;
import com.springboot.security.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to security";
	}
	
	@GetMapping("/all")
	public List<Product> getAllProduct(){
		return service.getProducts();
	}
    
	@GetMapping("{/id}")
	public Product getprodById(@PathVariable int id) {
		return service.getProdById(id);
	}
}
