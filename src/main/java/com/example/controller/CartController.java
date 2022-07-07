package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.*;
import com.example.service.CartService;

@RestController
public class CartController {
	@Autowired
	private CartService cartService;
	
	@GetMapping("/count_of_cart/{user_id}")
	public int getCount(@PathVariable("user_id") String user_id) throws Exception{
		return cartService.getCartCount(user_id);
	}

}
