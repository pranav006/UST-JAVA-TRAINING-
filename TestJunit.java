package com.psk.ust.A1;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestJunit {
@Test
public void testMethod1() {
	String str = "Welcome to Java";
	assertEquals("Welcome to JUnit",str);
}
}
