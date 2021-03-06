package com.cybage.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

import javax.persistence.*;

@Entity

@Table(name="product")
public class Product {
	
	@Id
	
	private int product_id;
	@Column
	private String product_name;
	@Column
	private float price;
	
	@OneToMany(mappedBy="product",cascade = CascadeType.ALL)
	private List<Order> order;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int product_id, String product_name, float price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	public List<Order> getOrder() {
		return order;
	}
	public void setOrder(List<Order> order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", price=" + price + ", order="
				+ order + "]";
	}
	
	

}
