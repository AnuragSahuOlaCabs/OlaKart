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
import com.example.service.ProductService;
import com.example.service.SellerService;

@CrossOrigin
@RestController
public class SellerController {

	@Autowired
	private SellerService sellerService;
	@Autowired
	private ProductService prodService;
	
//	API to get list of all sellers
	
	@GetMapping("/sellers")
	public List<Seller> getAllSellers(){
		return sellerService.getAllSellers();
	}
	
//	API to get seller details using store id
	
	@GetMapping("/sellers/{store_id}")
	public Seller getSellerbyId(@PathVariable("store_id") int store_id) throws Exception {
		return sellerService.getSellerById(store_id);
	}
	
//	API to login seller
	
	@PostMapping("/login_seller")
	public List<Seller> chkSeller(@RequestBody LoginCredentials loginCre) throws Exception {
		return this.sellerService.chkSeller(loginCre);	
	}
	
//	API to register a new seller
	
	@PostMapping("/register_seller")
	public Seller addSeller(@RequestBody Seller seller) throws Exception {
		Seller s = this.sellerService.saveOrUpdate(seller);
		return s;
	}
	
//  API to get product of a seller using the productId
	
	@GetMapping("/getproduct/{prod_id}")
	public Product getProduct(@PathVariable("prod_id") int prod_id) throws Exception {
		return prodService.getProductById(prod_id);
	}
	
//  API to get products of a store
	
	@GetMapping("/getallproductsbyseller/{store_id}")
	public List<Product> getAllProducts(@PathVariable("store_id") int store_id) throws Exception {
		return prodService.getAllProducts(store_id);
	}

//  API to add product to the store 
	
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) throws Exception {
		return prodService.addProducts(product);
	}

//  API to remove product from the store of the seller
	
	@GetMapping("/removeproductbyseller/{prod_id}")
	public void removeProductBySeller(@PathVariable("prod_id") int prod_id) throws Exception {
		prodService.removeProductBySeller(prod_id);
	}
}
