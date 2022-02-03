package com.psk;

import junit.framework.TestCase;

public class SomeTest extends TestCase{
	int v1,v2;
	protected void setUp() {
		v1=5;
		v2=7;
	}
	public void testMultiply() {
		int result = v1*v2;
		assertTrue(result==35);
	}
protected void tearDown() {
	System.out.println("Running teardown()");
	v1=v2=0;
}
}


