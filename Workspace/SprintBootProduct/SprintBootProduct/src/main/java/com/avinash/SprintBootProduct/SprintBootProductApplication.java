package com.avinash.SprintBootProduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprintBootProductApplication {

	public static void main(String[] args) {

		SpringApplication.run(SprintBootProductApplication.class, args);

		List<Project> projects = service.getAllProducts();
		for(Product p : products)
		{
			System.out.println(p);
		}
	}

}
