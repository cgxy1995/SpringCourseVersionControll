package com.kamijoTouma.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello, me injected by constructor";
	}

}
