package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cybage.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	


}
