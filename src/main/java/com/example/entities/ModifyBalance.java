package com.example.entities;

public class ModifyBalance {
	
	private int user_id;
	private int amount;
	
	
	public ModifyBalance(int user_id, int amount) {
		super();
		this.user_id = user_id;
		this.amount = amount;
	}
	
	public ModifyBalance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "WalletBalance [user_id=" + user_id + ", amount=" + amount + ", getUser_id()=" + getUser_id()
				+ ", getAmount()=" + getAmount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
