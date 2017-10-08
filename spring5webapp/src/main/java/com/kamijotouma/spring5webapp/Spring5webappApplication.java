package com.kamijotouma.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		System.out.println("booted!");
		SpringApplication.run(Spring5webappApplication.class, args);
	}
}
