package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Order {
	private int order_id;
	private int user_id;
	private int store_id;
	private int transaction_id;
	private int quantity;
	private int price;
	private String time;
	private String mode;
	
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Order(int order_id, int user_id, int store_id, int transaction_id, int quantity, int price, String time, String mode) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.store_id = store_id;
		this.transaction_id = transaction_id;
		this.quantity = quantity;
		this.price = price;
		this.time = time;
		this.mode = mode;
	}
	
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}


	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", user_id=" + user_id + ", store_id=" + store_id + ", transaction_id="
				+ transaction_id + ", quantity=" + quantity + ", price=" + price + ", time=" + time + ", mode=" + mode
				+ "]";
	}
	
	

}
