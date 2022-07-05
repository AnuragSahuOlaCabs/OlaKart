package com.example.entities;

public class LoginCredentials {
	private String email_id;
	private String password;
	
	
	public LoginCredentials() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginCredentials(String email_id, String password) {
		super();
		this.email_id = email_id;
		this.password = password;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginCredentials [email_id=" + email_id + ", password=" + password + "]";
	}
	
	

}
