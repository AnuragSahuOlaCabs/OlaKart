package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int user_id;
	private String first_name;
	private String email_id;
	private String password_en;
	private String phone_number;
	private String gender;
	private String photo;
	private String address;
	private int salt;
	private int wallet;
	/**
	 * @param user_id
	 * @param firstName
	 * @param email_id
	 * @param password_en
	 * @param gender
	 * @param address
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int user_id, String first_name, String email_id, String password_en, String phone_number, String gender,
			String photo, String address, int salt, int wallet) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.email_id = email_id;
		this.password_en = password_en;
		this.phone_number = phone_number;
		this.gender = gender;
		this.photo = photo;
		this.address = address;
		this.salt = salt;
		this.wallet = wallet;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
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
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalt() {
		return salt;
	}
	public void setSalt(int salt) {
		this.salt = salt;
	}
	public int getWallet() {
		return wallet;
	}
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", first_name=" + first_name + ", email_id=" + email_id + ", password_en="
				+ password_en + ", phone_number=" + phone_number + ", gender=" + gender + ", photo=" + photo
				+ ", address=" + address + ", salt=" + salt + ", wallet=" + wallet + ", getUser_id()=" + getUser_id()
				+ ", getFirst_name()=" + getFirst_name() + ", getEmail_id()=" + getEmail_id() + ", getPassword_en()="
				+ getPassword_en() + ", getPhone_number()=" + getPhone_number() + ", getGender()=" + getGender()
				+ ", getPhoto()=" + getPhoto() + ", getAddress()=" + getAddress() + ", getSalt()=" + getSalt()
				+ ", getWallet()=" + getWallet() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
		
}