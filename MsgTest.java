package com.psk;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class MsgTest {
@Before
public void setup() throws Exception
{
	System.out.println("Setting up ");
}


@Test
public void myTest()
{
	assertEquals("HiPranav",MyMessage.printMessage("Pranav"));
	System.out.print("Test passed");
}
}
