package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.entities.User;

public interface Repository extends CrudRepository<User, Integer> {
	
	@Query(value = "select * from User;", nativeQuery = true)
	public List<User> getUsers();
	
}
