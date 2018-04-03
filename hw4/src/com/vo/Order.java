package com.vo;

import java.util.ArrayList;

public class Order {
	private int id;
	private String orderNo;
	private String orderTime;
	private String orderPerson;
	private ArrayList<Product> products=new ArrayList<Product>();
	
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public Order() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getOrderPerson() {
		return orderPerson;
	}
	public void setOrderPerson(String orderPerson) {
		this.orderPerson = orderPerson;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNo=" + orderNo + ", orderTime=" + orderTime + ", orderPerson=" + orderPerson
				+ "]"+products;
	}
	
	
	
}
