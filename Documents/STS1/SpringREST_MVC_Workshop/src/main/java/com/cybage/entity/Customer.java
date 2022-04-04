package com.cybage.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="customer")
public class Customer {
	
	
	@Id
	@GeneratedValue
	private int customer_id;
	@Column
	private String name;
	@Column
	@JsonIgnoreProperties
	private String email;
	@Column
	private String address;
	
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Address> add;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String email, String address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	
	public List<Address> getAdd() {
		return add;
	}
	public void setAdd(List<Address> add) {
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", add=" + add + "]";
	}
	
	

}
