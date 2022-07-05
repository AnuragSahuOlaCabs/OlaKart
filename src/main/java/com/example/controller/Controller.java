package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.LoginCredentials;
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
	@PostMapping("/putuser")
	public User addBook(@RequestBody User book) throws Exception {
		User u = this.userService.putBook(book);
		return u;
	}
	@PostMapping("/login")
	public List<User> checkLogin(@RequestBody LoginCredentials loginCre) throws Exception {
		return this.userService.chkUser(loginCre);	
	}
}
