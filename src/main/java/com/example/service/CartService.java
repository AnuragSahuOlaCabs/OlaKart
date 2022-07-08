package com.example.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entities.*;

import com.example.dao.CartRepository;
import com.example.dao.ProductRepository;

@Service
public class CartService {
	@Autowired
	CartRepository cartRepo;
	ProductRepository prodRepo;
//	NewCartRepository NewCRepo;
	
	public int getCartCount(String ud){
		List<Cart> carts = new ArrayList<Cart>();
//		cartRepo.findAll().forEach(cart.getUser_id() -> carts.add(cart));
		int a = cartRepo.getCount(ud);
//		System.out.println(a);
		return a;
	}
	public List<Integer> getProductsInCart(int id) {
//		List<Integer> prod_ids = cartRepo.getProductsInCart(id);
//		List<Product> prod_details = new ArrayList<Product>();
//		for (int i=0;i<prod_ids.size();i++) {
//			Optional<Product> prod = prodRepo.findById(prod_ids.get(i));
//			prod_details.add(prod.get());
//		}
//		return prod_details;
		
		List<Product> prod_details = new ArrayList<Product>();
		
		return cartRepo.getProductsInCart(id);
//		System.out.println(cartRepo.getProductsInCart(id));
//		System.out.println("HERE");
//		prod_details.addAll(cartRepo.getProductsInCart(id));
//		return prod_details;
	}
	
//	public void checkoutCart(int user_id) {
//		cartRepo.checkoutCart(user_id);
//	}
}
