package com.cybage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.entity.Address;
import com.cybage.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository arepo;

	public void add(Address address) {
		arepo.save(address);
		
	}
	
	

}
