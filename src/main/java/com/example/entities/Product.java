package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int product_id;
	private String product_name;
	private String product_description;
	private int price;
	private int store_id;
	private int category_id;
	private int sub_category_id;
	private int brand_id;
	private float ratings;
	private int no_of_ratings;
	
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int product_id, String product_name, String product_description, int price, int store_id,
			int category_id, int sub_category_id, int brand_id, float ratings, int no_of_ratings) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.price = price;
		this.store_id = store_id;
		this.category_id = category_id;
		this.sub_category_id = sub_category_id;
		this.brand_id = brand_id;
		this.ratings = ratings;
		this.no_of_ratings = no_of_ratings;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
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

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public int getNo_of_ratings() {
		return no_of_ratings;
	}

	public void setNo_of_ratings(int no_of_ratings) {
		this.no_of_ratings = no_of_ratings;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_description="
				+ product_description + ", price=" + price + ", store_id=" + store_id + ", category_id=" + category_id
				+ ", sub_category_id=" + sub_category_id + ", brand_id=" + brand_id + ", ratings=" + ratings
				+ ", no_of_ratings=" + no_of_ratings + "]";
	}
	
	

}
