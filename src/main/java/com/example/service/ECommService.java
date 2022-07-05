package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entities.*;

import com.example.dao.Repository;

@Service
public class ECommService {
	@Autowired
	Repository eCommRepo;
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		eCommRepo.findAll().forEach(user -> users.add(user));
		return users;
	}
	
	public User getUserById(int id) {
		return eCommRepo.findById(id).get();
	}
	
	public User saveOrUpdate(User user) {
		eCommRepo.save(user);
		return user;
	}
	
	public List<User> chkCustomer(LoginCredentials loginChk) {
		List<User> list = new ArrayList<User>();
		List<User> users = new ArrayList<User>();
		eCommRepo.findAll().forEach(user1 -> list.add(user1));
		for (User i : list) {
			// Check for Passwords also
            if(i.getEmail_id().equals(loginChk.getEmail_id())) {
            	users.add(i);
            }
        }
        return users;
	}
	
	public void update(User user, int userId) {
		eCommRepo.save(user);
	}
}
