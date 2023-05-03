package com.google.scholar.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GoogleScholarApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleScholarApiApplication.class, args);
	}

}
