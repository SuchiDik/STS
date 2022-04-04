package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cybage.bean.Address;
import com.cybage.bean.StudentBean;

@SpringBootApplication(scanBasePackages = "com.cybage")
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootDemoApplication.class, args);
	ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootDemoApplication.class, args);
      StudentBean s =(StudentBean)ctx.getBean(StudentBean.class);
	Address address=(Address)ctx.getBean(Address.class);
	s.setName("suchita");
	address.setCity("pune");
	address.setState("MH");
	address.setStreet("dighi");
	s.setAddress(address);
	
	System.out.println(s);
	}

}
