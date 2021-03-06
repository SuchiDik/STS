package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cybage.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	// @Query(value="select * from Customer a where a.email= :email", nativeQuery=true)
	 Customer findByEmail(String email);

}
