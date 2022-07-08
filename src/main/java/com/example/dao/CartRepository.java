package com.example.dao;

import java.util.List;

import org.hibernate.annotations.Where;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Cart;
import com.example.entities.Product;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer>{

	@Query(value = "select count(user_id) from Cart where user_id = :ud", nativeQuery = true)
	public int getCount(String ud);
	
	@Query(value = "select product_id from Cart where user_id = :ud", nativeQuery = true)
	public List<Integer> getProductsInCart(int ud);
	
//	@SQLDelete(sql = "UPDATE cart SET deleted=true WHERE user_id= :ud")
//	public void checkoutCart(int ud);
}

