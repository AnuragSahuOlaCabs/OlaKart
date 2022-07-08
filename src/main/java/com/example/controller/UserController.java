package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.*;
import com.example.service.ECommService;

@CrossOrigin
@RestController
public class UserController {
	@Autowired
	private ECommService eCommService;
	
//	API to get all users
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return eCommService.getAllUsers();
	}

//	API to get details of a particular user
	
	@GetMapping("/users/{user_id}")
	public User getBookbyId(@PathVariable("user_id") int user_id) throws Exception {
		return eCommService.getUserById(user_id);
	}

//	API to register a user
	
	@PostMapping("/registeruser")
	public User addBook(@RequestBody User user) throws Exception {
		User u = this.eCommService.saveOrUpdate(user);
		return u;
	}
	
//  API to login by the user
	
	@PostMapping("/login_user")
	public List<User> checkLogin(@RequestBody LoginCredentials loginCre) throws Exception {
		return this.eCommService.chkCustomer(loginCre);	
	}
	
//	API to get the wallet balance of a user
	
	@GetMapping("/getwalletbalance/{user_id}")
	public int getWalBalanace(@PathVariable("user_id") int user_id) throws Exception {
		return eCommService.getWalletBalance(user_id);
	}
	
//	API to modify the wallet balance after a purchase
	
	@PostMapping("/reducewalletbalance")
	public int reduceWalBalanace(@RequestBody ModifyBalance modifybalanace) throws Exception {
		return eCommService.reduceWalletBalance(modifybalanace.getUser_id(), modifybalanace.getAmount());
	}
	
//	API to add money to wallet
	
	@PostMapping("/addToWallet")
	public int addWalBalanace(@RequestBody ModifyBalance modifybalanace) throws Exception {
		return eCommService.addWalletBalance(modifybalanace.getUser_id(), modifybalanace.getAmount());
	}
}
