package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductRepository;
import com.example.entities.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepo;
	public List<Product> getAllProducts(){
		List<Product> products = new ArrayList<Product>();
		productRepo.findAll().forEach(product -> products.add(product));
		return products;
	}

	public List<Product> getProductsbyCategoryId(String categoryId){
		List<Product> products = productRepo.getproductByCatId(categoryId);
		return products;
	}
	
	public List<Product> getProductsbyBrandId(String brandId){
		List<Product> products = productRepo.getproductByBraId(brandId);
		return products;
	}
}
