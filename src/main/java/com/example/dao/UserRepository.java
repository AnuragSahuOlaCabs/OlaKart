package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	
	@Query(value = "select wallet from user where user_id = :id", nativeQuery = true)
	public int getWalletBalance(int id);

	@Query(value = "select * from user;", nativeQuery = true)
	public List<User> getUsers();

	@Query(value = "select wallet from user where user_id = :id", nativeQuery = true)
	public int fetchWalletBalance(int id);
	
	@Query(value = "update user set wallet = wallet-:amount where user_id = :id", nativeQuery = true)
	public void reduceWalletBalance(int id, int amount);
	
	
}
