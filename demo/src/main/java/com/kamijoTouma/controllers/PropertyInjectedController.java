package com.kamijoTouma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.kamijoTouma.services.GreetingService;
@Controller
public class PropertyInjectedController {
	@Autowired
	@Qualifier("greetingServiceImpl")
	public GreetingService greetingService;
	
	public String sayHello() {
		
		return greetingService.sayHello();
	}
}
