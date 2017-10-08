package com.kamijoTouma.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.kamijoTouma.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
	private PropertyInjectedController propertyInjectedController;
	@Before
	public void setUp() throws Exception{
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}
	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
	}
}
