package com.example.entities;

public class Seller {
	
	private int store_id;
	private String email_id;
	private String store_name;
	private String seller_name;
	private String password;
	private String phone_number;
	private String store_address;
	
	
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seller(int store_id, String email_id, String store_name, String seller_name, String password,
			String phone_number, String store_address) {
		super();
		this.store_id = store_id;
		this.email_id = email_id;
		this.store_name = store_name;
		this.seller_name = seller_name;
		this.password = password;
		this.phone_number = phone_number;
		this.store_address = store_address;
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getSeller_name() {
		return seller_name;
	}
	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getStore_address() {
		return store_address;
	}
	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}
	@Override
	public String toString() {
		return "Seller [store_id=" + store_id + ", email_id=" + email_id + ", store_name=" + store_name
				+ ", seller_name=" + seller_name + ", password=" + password + ", phone_number=" + phone_number
				+ ", store_address=" + store_address + "]";
	}
	
	

}
