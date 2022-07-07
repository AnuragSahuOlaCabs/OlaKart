package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Brand;
import com.example.entities.Category;
import com.example.entities.Product;
import com.example.entities.Seller;
import com.example.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	@PostMapping("/getproducybycat")
	public List<Product> getProductsByCategory(@RequestBody Category category){
		String category_id = String.valueOf(category.getCategory_id());
		return productService.getProductsbyCategoryId(category_id);
	}
	@PostMapping("/getproducybybrand")
	public List<Product> getProductsByBrand(@RequestBody Brand brand){
		String brand_id = String.valueOf(brand.getBrand_id());
		return productService.getProductsbyBrandId(brand_id);
	}
}
