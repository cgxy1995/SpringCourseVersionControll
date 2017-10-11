package com.kamijoTouma.services;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

	@Override
	public String test() {
		return "test service";
	}

}
