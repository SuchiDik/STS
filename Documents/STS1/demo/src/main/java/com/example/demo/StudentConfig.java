package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StudentConfig {
	
	
	//DI using setters
	@Bean(name="student")
	@Scope(value="prototype")
	public StudentBean getStudent()
	{
		StudentBean s=new StudentBean();
		s.setName("Om");
		Address address=new Address();
		address.setCity("Manali");
		address.setStreet("vm");
		address.setState("GJ");
		s.setAddress(address);
//		s.setId(10);
//		s.setName("suchita");
	return s;
		
		
	}

}
