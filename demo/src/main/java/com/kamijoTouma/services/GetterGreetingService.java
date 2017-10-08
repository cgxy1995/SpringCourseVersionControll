package com.kamijoTouma.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello, me injected by getter";
	}

}
