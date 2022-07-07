package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

	@Query(value = "select * from product where category_id = :catId", nativeQuery=true)
	public List<Product> getproductByCatId(String catId);
	
//	@Query(value = "select count(user_id) from Cart where user_id = :ud", nativeQuery = true)
//	public int getCount(String ud);
}
