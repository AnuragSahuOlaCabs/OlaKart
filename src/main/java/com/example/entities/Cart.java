package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Cart {
	@Id
	private int user_id;
	private int product_id;
	private int number_of_products;
	
	public Cart(int user_id, int product_id, int number_of_products) {
		super();
		this.user_id = user_id;
		this.product_id = product_id;
		this.number_of_products = number_of_products;
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
	public int getNumber_of_products() {
		return number_of_products;
	}
	public void setNumber_of_products(int number_of_products) {
		this.number_of_products = number_of_products;
	}
	
	@Override
	public String toString() {
		return "Cart [user_id=" + user_id + ", product_id=" + product_id + ", number_of_products=" + number_of_products
				+ ", getUser_id()=" + getUser_id() + ", getProduct_id()=" + getProduct_id()
				+ ", getNumber_of_products()=" + getNumber_of_products() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
	