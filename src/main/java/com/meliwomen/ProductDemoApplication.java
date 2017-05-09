package com.meliwomen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class ProductDemoApplication {

	public static void main(String[] args) {
		setupEnvironment();
		SpringApplication.run(ProductDemoApplication.class, args);
	}

	static void setupEnvironment() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
}
