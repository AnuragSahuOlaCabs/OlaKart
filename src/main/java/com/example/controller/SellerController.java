package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.LoginCredentials;
import com.example.entities.Product;
import com.example.entities.Seller;
import com.example.entities.User;
import com.example.service.ProductService;
import com.example.service.SellerService;

@CrossOrigin
@RestController
public class SellerController {

	@Autowired
	private SellerService sellerService;
	@Autowired
	private ProductService prodService;
	
	
	@GetMapping("/sellers")
	public List<Seller> getAllSellers(){
		return sellerService.getAllSellers();
	}
	
	@GetMapping("/sellers/{id}")
	public Seller getSellerbyId(@PathVariable("id") int id) throws Exception {
		return sellerService.getSellerById(id);
	}
	
	@PostMapping("/login_seller")
	public List<Seller> chkSeller(@RequestBody LoginCredentials loginCre) throws Exception {
		return this.sellerService.chkSeller(loginCre);	
	}
	
	@PostMapping("/register_seller")
	public Seller addSeller(@RequestBody Seller seller) throws Exception {
		Seller s = this.sellerService.saveOrUpdate(seller);
		return s;
	}
	
	@GetMapping("/getproduct/{prod_id}")
	public Product getProduct(@PathVariable("prod_id") int prod_id) throws Exception {
		return prodService.getProductById(prod_id);
	}
	
	@GetMapping("/getallproducts/{store_id}")
	public List<Product> getAllProducts(@PathVariable("store_id") int store_id) throws Exception {
		return prodService.getAllProducts(store_id);
	}
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) throws Exception {
		return prodService.addProducts(product);
	}
	
	

}
