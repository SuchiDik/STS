package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.entity.Customer;
import com.cybage.exception.CustomerNotFoundException;
import com.cybage.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cservice;
	
	@PostMapping("/add")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer )
	{
		 cservice.add(customer);
		return new ResponseEntity<String>("Customer Added",HttpStatus.CREATED);
		
		
	}

	@GetMapping("/getcustomer/{customer_id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable int customer_id) throws CustomerNotFoundException 
	{
	Customer customer=cservice.getCustomerById(customer_id);
		 if(customer ==null)
		 {
			throw new CustomerNotFoundException("Not found");
			 
		 }
		return new ResponseEntity<Customer>(customer,HttpStatus.FOUND);
		
		
	}

	@GetMapping("/get")
	public ResponseEntity<List<Customer>> viewCustomer()
	{
		 
		return new ResponseEntity<List<Customer>>(cservice.getdetails(),HttpStatus.CREATED);
			
	}

	@DeleteMapping("/delete/{id}")
public String deleteCustomerById(@PathVariable("id") int customer_id )
{
cservice.deleteCustomerById(customer_id);
return "Deleted Successfully";
}
	

@PutMapping("/update/{id}")
   public Customer
    updateCustomer(@RequestBody Customer customer, @PathVariable("id") int customer_id)
    {
        return cservice.updateProduct(customer, customer_id);
    }

@GetMapping("/getemail")
public ResponseEntity<Customer> getByEmail(String email)
{
	 
	return new ResponseEntity<Customer>(cservice.getByEmail(email),HttpStatus.CREATED);
		
}

}
