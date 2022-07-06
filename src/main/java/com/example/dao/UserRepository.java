package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	
	@Query(value = "select * from User;", nativeQuery = true)
	public List<User> getUsers();
	
	
	
}
