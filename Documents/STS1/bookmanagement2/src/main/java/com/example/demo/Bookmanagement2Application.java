package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.*")
public class Bookmanagement2Application {

	public static void main(String[] args) {
		SpringApplication.run(Bookmanagement2Application.class, args);
	}

}
