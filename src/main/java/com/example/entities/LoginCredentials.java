package com.example.entities;


public class LoginCredentials {
	private String email_id;
	private String password_en;
	
	
	public LoginCredentials() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginCredentials(String email_id, String password_en) {
		super();
		this.email_id = email_id;
		this.password_en = password_en;
	}
	public String getEmail_id() {
		return email_id.trim();
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword_en() {
		return password_en;
	}
	public void setPassword(String password_en) {
		this.password_en = password_en;
	}
	@Override
	public String toString() {
		return "LoginCredentials [email_id=" + email_id + ", password_en=" + password_en + "]";
	}
	
	

}
