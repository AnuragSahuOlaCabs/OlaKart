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
	
//  API to get the number of products in the cart of the user
	
	@GetMapping("/count_of_cart/{user_id}")
	public int getCount(@PathVariable("user_id") String user_id) throws Exception{
		return cartService.getCartCount(user_id);
	}
	
//  API to get the products	in the cart of the user
	
	@GetMapping("/getproductsincart/{user_id}")
	public List<Product> getProductsInCart(@PathVariable("user_id") int user_id) throws Exception {
		List<Integer> list_of_product_ids = cartService.getProductsInCart(user_id);
		List<Product> list_of_product = new ArrayList<Product>();
		for(int i : list_of_product_ids) {
			list_of_product.add(prodService.getProductById(i));
		}
		return list_of_product;	
	}

//	API to add a product in the cart of the user
	
	@PostMapping("/addtocart")
	public Cart addToCart(@RequestBody Cart cart) throws Exception {
		return cartService.AddToCart(cart);
	}

//	API to remove a product in the cart of the user
	
	@PostMapping("/removefromcart")
	public void removeFromCart(@RequestBody Cart cart) throws Exception {
		cartService.removeFromCart(cart);
	}
	
//	API to remove all products in the cart after checkout by the user
	
	@GetMapping("/checkoutcart/{user_id}")
	public void checkoutCart(@PathVariable("user_id") int user_id) throws Exception{
		cartService.getCartObjects(user_id);
	}

}
