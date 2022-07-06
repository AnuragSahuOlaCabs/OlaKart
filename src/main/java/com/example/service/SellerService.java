package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entities.*;

import com.example.dao.SellerRepository;

@Service
public class SellerService {
	@Autowired
	SellerRepository sellerRepo;
	public List<Seller> getAllSellers(){
		List<Seller> sellers = new ArrayList<Seller>();
		sellerRepo.findAll().forEach(seller -> sellers.add(seller));
		return sellers;
	}
	
	public Seller getSellerById(int id) {
		return sellerRepo.findById(id).get();
	}
	
	public Seller saveOrUpdate(Seller seller) {
		sellerRepo.save(seller);
		return seller;
	}
	
	public List<Seller> chkSeller(LoginCredentials loginChk) {
		List<Seller> list = new ArrayList<Seller>();
		List<Seller> sellers = new ArrayList<Seller>();
		sellerRepo.findAll().forEach(seller1 -> list.add(seller1));
		for (Seller i : list) {
			// Check for Passwords also
            if(i.getEmail_id().equals(loginChk.getEmail_id())) {
            	sellers.add(i);
            }
        }
        return sellers;
	}
	
	public void update(Seller seller, int sellerId) {
		sellerRepo.save(seller);
	}
}
