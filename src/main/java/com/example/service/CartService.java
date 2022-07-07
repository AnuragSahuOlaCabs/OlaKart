package com.example.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entities.*;

import com.example.dao.CartRepository;

@Service
public class CartService {
	@Autowired
	CartRepository cartRepo;
	public int getCartCount(String ud){
		List<Cart> carts = new ArrayList<Cart>();
//		cartRepo.findAll().forEach(cart.getUser_id() -> carts.add(cart));
		int a = cartRepo.getCount(ud);
//		System.out.println(a);
		return a;
	}
	
}
