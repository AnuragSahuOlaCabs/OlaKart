package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Seller;


@Repository
public interface SellerRepository extends CrudRepository<Seller, Integer>{

}
