package com.example.entities;

public class CountCart {

	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @param count
	 */
	public CountCart(int count) {
		super();
		this.count = count;
	}

	/**
	 * 
	 */
	public CountCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CountCart [count=" + count + ", getCount()=" + getCount() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
