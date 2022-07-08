package com.example.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entities.*;
import com.example.dao.CartRepository;
import com.example.dao.ProductRepository;

@Service
public class CartService {
	@Autowired
	CartRepository cartRepo;
	ProductRepository prodRepo;
	
	public int getCartCount(String user_id){
		return cartRepo.getCount(user_id);
	}
	
	public List<Integer> getProductsInCart(int id) {
		return cartRepo.getProductsInCart(id);
	}
	
	public void getCartObjects(int user_id) {
		List<Cart> cartObjects = cartRepo.getCartObjects(user_id);
		for(Cart c : cartObjects) {
			cartRepo.delete(c);
		}
	}
	
	public Cart AddToCart(Cart cart) {
		cartRepo.save(cart);
		return cart;
	}

	public void removeFromCart(Cart cart) {
		cartRepo.delete(cart);
	}
}
