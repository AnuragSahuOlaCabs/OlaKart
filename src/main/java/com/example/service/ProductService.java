package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	
	public List<Product> getRandomProducts(){
//		List<Product> products = new ArrayList<Product>();
		return productRepo.getrandomproducts();
//		return products;
	}
	
	public Product getProductById(int pid){
		return productRepo.getProductById(pid);
	}
//	public List<Product> getProductsInCart(int id) {
//		List<Integer> prod_ids = cartRepo.getProductsInCart(id);
//		List<Product> prod_details = new ArrayList<Product>();
//		for (int i=0;i<prod_ids.size();i++) {
//			Optional<Product> prod = productRepo.findById(prod_ids.get(i));
//			prod_details.add(prod.get());
//		}
//		return prod_details;
//		}

//	public Product getProduct(int prod_id) {
//		return productRepo.getProductBySeller(prod_id);
//	}

	public List<Product> getAllProducts(int store_id) {
		return productRepo.getAllProducts(store_id);
	}

	public Product addProducts(Product product) {
		return productRepo.save(product);
	}

	
}
