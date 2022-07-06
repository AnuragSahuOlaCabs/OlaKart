package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entities.Product;

import com.example.service.ProductService;


public class ProductController {
	
	@Autowired
	private ProductService productService;
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}

}
