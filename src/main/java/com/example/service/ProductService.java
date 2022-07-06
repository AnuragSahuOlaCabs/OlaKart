package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.ProductRepository;
import com.example.entities.Product;


public class ProductService {
	
	@Autowired
	ProductRepository productRepo;
	public List<Product> getAllProducts(){
		List<Product> products = new ArrayList<Product>();
		productRepo.findAll().forEach(product -> products.add(product));
		return products;
	}

}
