package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entities.*;
import com.example.dao.UserRepository;

@Service
public class ECommService {
	@Autowired
	UserRepository eCommRepo;
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		eCommRepo.findAll().forEach(user -> users.add(user));
		return users;
	}
	
	public User getUserById(int id) {
		return eCommRepo.findById(id).get();
	}
	
	public User saveOrUpdate(User user) {
	
		// Encrypt Password
		String pepper = "12345678";
		
		// get salt
		String salt = "1234";
		
		String mixedPassword = user.getPassword_en() + salt + pepper;
		int encryptedPasswordInt = mixedPassword.hashCode();
		String encryptedPassword = Integer.toString(encryptedPasswordInt);
		
		System.out.println("Registration Password : "+user.getPassword_en()+" "+encryptedPassword);
		
		user.setPassword_en(encryptedPassword);
		
		eCommRepo.save(user);
		return user;
	}
	
	public List<User> chkCustomer(LoginCredentials loginChk) {
		List<User> list = new ArrayList<User>();
		List<User> users = new ArrayList<User>();
		
		// Encrypt Password
		String pepper = "12345678";
		
		// get salt
		String salt = "1234";
		
		String mixedPassword = loginChk.getPassword_en() + salt + pepper;
		int encryptedPasswordInt = mixedPassword.hashCode();
		String encryptedPassword = Integer.toString(encryptedPasswordInt);
		System.out.println("Login Password : "+loginChk.getPassword_en()+" "+encryptedPassword);
		
		eCommRepo.findAll().forEach(user1 -> list.add(user1));
		for (User i : list) {
			// Check for Passwords also
			
            if(i.getEmail_id().equals(loginChk.getEmail_id()) &&
            		i.getPassword_en().equals(encryptedPassword)) {
            	users.add(i);
            }
        }
        return users;
	}
	
	public void update(User user, int userId) {
		eCommRepo.save(user);
	}

	public int getWalletBalance(int userId) {
		return eCommRepo.getWalletBalance(userId);
	}


	public int reduceWalletBalance(int userId, int amount) {
		
		Optional<User> user = eCommRepo.findById(userId);
		int reducedAmount = user.get().getWallet() - amount;
		if(reducedAmount <= 0) {
			return -1;
		}
		user.get().setWallet(reducedAmount);
		eCommRepo.save(user.get());
		return reducedAmount;
	}
	
	public int addWalletBalance(int userId, int amount) {
		
		Optional<User> user = eCommRepo.findById(userId);
		int increaredAmount = user.get().getWallet() + amount;
		user.get().setWallet(increaredAmount);
		eCommRepo.save(user.get());
		return increaredAmount;
	}

	
}
