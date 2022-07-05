package com.example.entities;

public class User {
	private int user_id;
	private String FirstName;
	private String email_id;
	private String password_en;
	private String phone_number;
	private String gender;
	private String address;
	/**
	 * @param user_id
	 * @param firstName
	 * @param email_id
	 * @param password_en
	 * @param gender
	 * @param address
	 */
	public User(int user_id, String firstName, String email_id, String password_en, String phone_number, String gender, String address) {
		super();
		this.user_id = user_id;
		FirstName = firstName;
		this.email_id = email_id;
		this.password_en = password_en;
		this.phone_number = phone_number;
		this.gender = gender;
		this.address = address;
	}
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getPhone_number() {
		return this.phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword_en() {
		return password_en;
	}
	public void setPassword_en(String password_en) {
		this.password_en = password_en;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", FirstName=" + FirstName + ", email_id=" + email_id + ", password_en="
				+ password_en + ", gender=" + gender + ", address=" + address + "]";
	}
	
	

}
