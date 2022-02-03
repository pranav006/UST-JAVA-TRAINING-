package com.psk;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestTest {


	@Test
	public void positiveCase() {
		assertEquals(156,SimpleInterest.simpleInterest(100,13,12));
		
	}
	@Test
	public void negativeCase() {
		assertEquals(143,SimpleInterest.simpleInterest(100,13,12));
		
	}	
}
