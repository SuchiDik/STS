package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.entity.Customer;
import com.cybage.repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository crepo;

	public void add(Customer customer) {
		crepo.save(customer);
		
	}

	public Customer getCustomerById(int customer_id) {
		return crepo.findById(customer_id).orElse(null);
	}

	public List<Customer> getdetails() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

	public Customer updateProduct(Customer customer, int customer_id) {
		Customer cust= crepo.findById(customer_id).get();
		customer.setName(customer.getName());
		customer.setEmail(customer.getEmail());
		customer.setAddress(customer.getAddress());
        return crepo.save(cust);
	}

	public void deleteCustomerById(int customer_id) {
		crepo.deleteById(customer_id);
		
	}

	public Customer getByEmail(String email) {
		// TODO Auto-generated method stub
		return crepo.findByEmail(email);
	}

}
