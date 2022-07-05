package com.example.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	private static List<User> list = new ArrayList<>();
	
	static {
		list.add(new User(1, "Anurag", "anurag.sahu@olacabs.com", "here", "8602043478", "male", "Koramangala"));
		list.add(new User(2, "Abhishek", "Abhishek.sahu@olacabs.com", "here", "8602043478", "male", "Koramangala"));
		list.add(new User(3, "Akash", "Akash.sahu@olacabs.com", "here", "8602043478", "male", "Koramangala"));
	}
	
	public List<User> getAllUsers(){
		return list;
	}
	
	public List<User> getUser(int id) throws Exception{
		List<User> user = list.stream().filter(b->b.getUser_id()==id).collect(Collectors.toList());
		return user;
	}
	
	public User putBook(User user) throws Exception {
		list.add(user);
		return user;
	}
	
	public List<User> chkUser(LoginCredentials loginChk) throws Exception {
		System.out.println(loginChk.getEmail_id());
		System.out.println(loginChk.getPassword());
		List<User> user = list.stream().filter(b->b.getEmail_id()==loginChk.getEmail_id()).collect(Collectors.toList());
		return user;
	}
}
