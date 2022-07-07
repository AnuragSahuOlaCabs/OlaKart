package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Cart {
	@Id
	private int user_id;
	private int product_id;
	private String numberOfProducts;
	
	public Cart(int user_id, int product_id, String numberOfProducts) {
		super();
		this.user_id = user_id;
		this.product_id = product_id;
		this.numberOfProducts = numberOfProducts;
	}
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getNumberOfProducts() {
		return numberOfProducts;
	}
	public void setNumberOfProducts(String numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}
	
	@Override
	public String toString() {
		return "Cart [user_id=" + user_id + ", product_id=" + product_id + ", numberOfProducts=" + numberOfProducts
				+ ", getUser_id()=" + getUser_id() + ", getProduct_id()=" + getProduct_id() + ", getNumberOfProducts()="
				+ getNumberOfProducts() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
