package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.CountCart;
import com.example.entities.LoginCredentials;
import com.example.entities.Seller;
import com.example.entities.User;
import com.example.entities.UserService;

@RestController
public class Controller {
	@Autowired
	private UserService userService;
	@GetMapping("/users")
	public List<User> getUsers(){
		return userService.getAllUsers();
	}
	@GetMapping("/users/{id}")
	public List<User> getBookbyId(@PathVariable("id") int id) throws Exception {
		return userService.getUser(id);
	}
	@PostMapping("/registeruser")
	public User addBook(@RequestBody User user) throws Exception {
		User u = this.userService.putUser(user);
		return u;
	}
	@PostMapping("/login")
	public List<User> checkLogin(@RequestBody LoginCredentials loginCre) throws Exception {
		return this.userService.chkCustomer(loginCre);	
	}
	
	// Seller Registration
	@GetMapping("/sellers")
	public List<Seller> getSeller(){
		return userService.getAllSeller();
	}
	@PostMapping("/registerseller")
	public Seller addSeller(@RequestBody Seller seller) throws Exception {
		Seller u = this.userService.putSeller(seller);
		return u;
	}
	
	//Seller Login
	@PostMapping("/loginseller")
	public List<Seller> checkLoginSeler(@RequestBody LoginCredentials loginCre) throws Exception {
		return this.userService.chkSeller(loginCre);	
	}
	// count the number of objects in cart
	@PostMapping("/count_of_cart")
	public CountCart getNumberOfObjectsInCart(@RequestBody User user) throws Exception {
		return this.userService.getObjectsInCartCount(user);
	}
	
}
