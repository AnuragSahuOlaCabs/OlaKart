package com.example.entities;

public class Category {
	private String category_name;
	private int category_id;
	private int sub_category_id;
	
	
	
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(String category_name, int category_id, int sub_category_id) {
		super();
		this.category_name = category_name;
		this.category_id = category_id;
		this.sub_category_id = sub_category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getSub_category_id() {
		return sub_category_id;
	}
	public void setSub_category_id(int sub_category_id) {
		this.sub_category_id = sub_category_id;
	}
	@Override
	public String toString() {
		return "Category [category_name=" + category_name + ", category_id=" + category_id + ", sub_category_id="
				+ sub_category_id + "]";
	}
	

}
