package com.example.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.*;
import com.example.service.CartService;
import com.example.service.ProductService;

@CrossOrigin
@RestController
public class CartController {
	@Autowired
	private CartService cartService;
	@Autowired
	private ProductService prodService;
	
	@GetMapping("/count_of_cart/{user_id}")
	public int getCount(@PathVariable("user_id") String user_id) throws Exception{
		return cartService.getCartCount(user_id);
	}
	
	@GetMapping("/getproductsincart/{id}")
	public List<Product> getProductsInCart(@PathVariable("id") int id) throws Exception {
//		System.out.println("HEre");
		List<Integer> list_of_product_ids = cartService.getProductsInCart(id);
		List<Product> list_of_product = new ArrayList<Product>();
		for(int i : list_of_product_ids) {
			list_of_product.add(prodService.getProductById(i));
		}
		return list_of_product;
		
	}
//	@DeleteMapping("/checkoutcart/{user_id}")
//	public void checkoutCart(@PathVariable("user_id") int user_id) throws Exception{
//		cartService.checkoutCart(user_id);
//	}

}
