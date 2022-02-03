package com.psk;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class CalcApplicationTester {
@InjectMocks
CalcApplication calcApplication = new CalcApplication();
@Mock
CalculatorService calcService;

	
	

	@SuppressWarnings("deprecation")
	@Test
	public void testAdd() {
		when(calcService.add(10.0,20.0)).
		thenReturn(35.0);
		
		Assert.assertEquals(calcApplication.add(10.0,20.0),30.0,5.0);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSub() {
		when(calcService.sub(100.0,70.0)).
		thenReturn(30.0);
		
		Assert.assertEquals(calcApplication.sub(100.0,70.0),30.0,0);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testMul() {
		when(calcService.mul(9.0,5.0)).
		thenReturn(45.0);
		
		Assert.assertEquals(calcApplication.mul(9.0,5.0),45.0,0);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testDiv() {
		when(calcService.div(100.0,20.0)).
		thenReturn(5.0);
		
		Assert.assertEquals(calcApplication.div(100.0,20.0),5.0,0);
	}

}
