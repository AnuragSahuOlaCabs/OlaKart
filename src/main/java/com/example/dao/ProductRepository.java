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
	
	@Query(value = "select * from product where brand_id = :braId", nativeQuery=true)
	public List<Product> getproductByBraId(String braId);
	
	@Query(value = "select * from product order by rand() limit 4", nativeQuery=true)
	public List<Product> getrandomproducts();
	
	@Query(value = "select * from product where product_id = :p_id", nativeQuery=true)
	public List<Product> getProductById(int p_id);
	
	
//	@Query(value = "select * from product where product_id = :proId", nativeQuery=true)
//	public List<Product> getrandomproducts(proId);
	
//	@Query(value = "select count(user_id) from Cart where user_id = :ud", nativeQuery = true)
//	public int getCount(String ud);
}
