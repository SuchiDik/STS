package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentBean {
	
	String name;
	Address address;
	



	public StudentBean() {
		super();
		System.out.println("constructor 1");
	}


	public StudentBean(String name, Address address) {
		
		super();
		System.out.println("constructor");
		this.name = name;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", address=" + address + "]";
	}
@PostConstruct	
	public void init()
	{
		System.out.println("init");
	}

@PreDestroy
public void destroybean()
{
	System.out.println("destroyed");}
}
