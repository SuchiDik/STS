package com.cybage.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="address")
public class Address { 
	
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String area;
	@Column
	private String city;
	@Column
	private String pincode;
	
@ManyToOne
@JsonIgnore
Customer customer;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String area, String city, String pincode) {
		super();
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
