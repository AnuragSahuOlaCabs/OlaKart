package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer>{

	@Query(value = "select count(user_id) from Cart where user_id = :ud", nativeQuery = true)
	public int getCount(String ud);
}
