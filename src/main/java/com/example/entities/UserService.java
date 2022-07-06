package com.example.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	private static List<User> list = new ArrayList<>();
	private static List<Seller> listSeller = new ArrayList<>();

	
	static {
		list.add(new User(1, "Anurag", "anurag.sahu@olacabs.com", "here", "8602043478", "male", "Koramangala"));
		list.add(new User(2, "Abhishek", "Abhishek.sahu@olacabs.com", "here", "8602043478", "male", "Koramangala"));
		list.add(new User(3, "Akash", "Akash.sahu@olacabs.com", "here", "8602043478", "male", "Koramangala"));
	}
	
	static {
		listSeller.add(new Seller(123, "taraFancyStore1@gmail.com", "Tara Fancy Store", "Tara", "12345","9530767450","1-p-6 Banglore"));
		listSeller.add(new Seller(43, "foodAdda@gmail.com", "Food Adda", "Rajesh", "12345","9530767456","1-p-7 Banglore"));
	}
	
	public List<User> getAllUsers(){
		return list;
	}
	
	public List<User> getUser(int id) throws Exception{
		List<User> user = list.stream().filter(b->b.getUser_id()==id).collect(Collectors.toList());
		return user;
	}
	
	public User putUser(User user) throws Exception {
		// Check if email id is correct in format
		// Check if the email already exists in DB
		
		list.add(user);
		return user;
	}
	
	public List<User> chkCustomer(LoginCredentials loginChk) throws Exception {

		ArrayList<User> user = new ArrayList<User>();

        for (User i : list) {
        	System.out.print(i.getEmail_id().equals(loginChk.getEmail_id()));
            if(i.getEmail_id().equals(loginChk.getEmail_id()) && i.getPassword_en().equals(loginChk.getPassword_en())) {
            	user.add(i);
            }
        }
        
        return user;
		
//		System.out.println(user.size());
//		return user;
	}
	
	//Seller
	public List<Seller> getAllSeller(){
		return listSeller;
	}
	
	
	
	public Seller putSeller(Seller seller) throws Exception {
		
		listSeller.add(seller);
		return seller;
	}
	
	public List<Seller> chkSeller(LoginCredentials loginChk) throws Exception {

		ArrayList<Seller> seller = new ArrayList<Seller>();

        for (Seller i : listSeller) {
        	System.out.print(i.getEmail_id().equals(loginChk.getEmail_id()));
            if(i.getEmail_id().equals(loginChk.getEmail_id()) && i.getPassword().equals(loginChk.getPassword_en())) {
            	seller.add(i);
            }
        }
        
        return seller;
	}
	
	public CountCart getObjectsInCartCount(User user) throws Exception {
		// Calculate the number of Object in cart Via SQL
		
		CountCart c = new CountCart(3);
		return c;
	}
	
}
