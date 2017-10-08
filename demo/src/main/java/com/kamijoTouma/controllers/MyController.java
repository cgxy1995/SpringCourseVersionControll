package com.kamijoTouma.controllers;

import org.springframework.stereotype.Controller;

import com.kamijoTouma.services.GreetingService;

@Controller
public class MyController {
	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {
		return greetingService.sayHello();
	}
}
