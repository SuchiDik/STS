package com.cybage.service;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cybage.entity.Product;
import com.cybage.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository prepo;

	public void add(Product product) {
		// TODO Auto-generated method stub
		 prepo.save(product);
	}

	public List<Product> getdetails() {
		return prepo.findAll();
		
	}

	public Product getProductById(int product_id) {
		return prepo.findById(product_id).orElse(null);
	}

	public void deleteProductById(int id) {
		prepo.deleteById(id);
		
	}

	

	public Product updateProduct(Product product, int product_id) {
		Product p= prepo.findById(product_id).get();
		p.setProduct_name(product.getProduct_name());
		p.setPrice(product.getPrice());
        return prepo.save(product);
		
	}



}
