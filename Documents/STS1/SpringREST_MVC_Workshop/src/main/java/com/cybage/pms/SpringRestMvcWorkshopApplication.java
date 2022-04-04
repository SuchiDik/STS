package com.cybage.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.cybage.*")
@EnableJpaRepositories(basePackages = "com.cybage.repository")
@EntityScan(basePackages = "com.cybage.entity")
public class SpringRestMvcWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestMvcWorkshopApplication.class, args);
	}

}
