package com.cybage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.entity.Product;
import com.cybage.exception.RecordNotFoundException;
import com.cybage.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService pservice;
	
			@PostMapping("/add")
			public ResponseEntity<String> addProduct(@RequestBody Product product )
			{
				 pservice.add(product);
				return new ResponseEntity<String>("Added",HttpStatus.CREATED);
				
				
			}
	
			@GetMapping("/getproduct/{product_id}")
			public ResponseEntity<Product> getProductById(@PathVariable int product_id) throws RecordNotFoundException
			{
			Product product=pservice.getProductById(product_id);
				 if(product ==null)
				 {
					throw new RecordNotFoundException("Not found");
					 
				 }
				return new ResponseEntity<Product>(product,HttpStatus.FOUND);
				
				
			}
	
			@GetMapping("/get")
			public ResponseEntity<List<Product>> viewProduct()
			{
				 
				return new ResponseEntity<List<Product>>(pservice.getdetails(),HttpStatus.CREATED);
					
			}
		
			@DeleteMapping("/delete/{id}")
		public String deleteProductById(@PathVariable("id") int product_id )
		{
		pservice.deleteProductById(product_id);
		return "Deleted Successfully";
		}
			
	
		@PutMapping("/update/{id}")
		   public Product
		    updateProduct(@RequestBody Product product, @PathVariable("id") int product_id)
		    {
		        return pservice.updateProduct(product, product_id);
		    }
	 
    
	
	
}
