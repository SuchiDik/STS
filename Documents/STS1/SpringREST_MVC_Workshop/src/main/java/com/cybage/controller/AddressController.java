package com.cybage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.entity.Address;
import com.cybage.entity.Customer;
import com.cybage.service.AddressService;
import com.cybage.service.CustomerService;

@RestController
public class AddressController {

	@Autowired
	AddressService aservice;
	
	@PostMapping("/addaddress")
	public ResponseEntity<String> addAddress(@RequestBody Address address )
	{
		 aservice.add(address);
		return new ResponseEntity<String>("Address Added",HttpStatus.CREATED);
		
		
	}
}
