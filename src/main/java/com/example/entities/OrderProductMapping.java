package com.example.entities;

import javax.persistence.Entity;


public class OrderProductMapping {
	
	private int order_id;
	private int product_id;
	
	
	
	public OrderProductMapping() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderProductMapping(int order_id, int product_id) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	@Override
	public String toString() {
		return "OrderProductMapping [order_id=" + order_id + ", product_id=" + product_id + "]";
	}
	
	

}
