package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfig {
	
	//DI using setters
	@Bean(name="address")
	public Address getAdd()
	{
		Address s=new Address("dighi","mumbai","MH");
//		s.setId(10);
//		s.setName("suchita");
	return s;
		

}
}