package com.springboot.security.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.security.entity.Product;
import com.springboot.security.repo.ProductRepo;

import jakarta.annotation.PostConstruct;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo repo;

	List<Product> productList = null;

	@PostConstruct
	public void loadProductFromDb() {
		productList = IntStream.range(1, 100)
				.mapToObj(i -> new Product(i, "product " + i, new Random().nextInt(10), new Random().nextDouble(50000)))
				.collect(Collectors.toList());

	}

	@Override
	public Product getProdById(int id) {
		return productList.stream().filter(product -> product.getProductId() == id).findAny()
				.orElseThrow(() -> new RuntimeException("product " + id + "not found"));
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productList;
	}

}
