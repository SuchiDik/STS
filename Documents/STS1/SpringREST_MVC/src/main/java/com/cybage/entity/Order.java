package com.cybage.entity;

import java.util.List;

import javax.persistence.*;


@Entity

@Table(name="order_table")
public class Order {
	
	
	@Id
	private int order_id;
	@Column
	private int amount;
	
	@ManyToOne
	Product product;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int order_id, int amount) {
		super();
		this.order_id = order_id;
		this.amount = amount;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", amount=" + amount + ", product=" + product + "]";
	}
	
	

}
