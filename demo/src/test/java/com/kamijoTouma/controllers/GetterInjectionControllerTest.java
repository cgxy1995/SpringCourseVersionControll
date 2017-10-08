package com.kamijoTouma.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.kamijoTouma.services.GreetingServiceImpl;

public class GetterInjectionControllerTest {
	private GetterInjectedController getterInjectedController;
	
	@Before
	public void setUp() throws Exception{
		this.getterInjectedController = new GetterInjectedController();
		this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO, getterInjectedController.sayHello());
	}
}
