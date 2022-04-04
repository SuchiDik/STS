package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cybage.*")
public class SpringBootDemo31Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo31Application.class, args);
	}

}
