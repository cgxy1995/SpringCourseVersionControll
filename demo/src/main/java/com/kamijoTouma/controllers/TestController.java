package com.kamijoTouma.controllers;

import org.springframework.stereotype.Controller;

import com.kamijoTouma.services.TestService;
@Controller
public class TestController {
	private TestService testService;

	public TestController(TestService testService) {
		this.testService = testService;
	}
	public String doTest() {
		return testService.test();
	}
}
