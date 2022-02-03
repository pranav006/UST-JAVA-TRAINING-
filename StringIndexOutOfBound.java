package com.psk.ust.A1;

public class StringIndexOutOfBound {
	public static void main(String[] args)
	{try {
		String s1 =  "Have a nice day!";
		char c= s1.charAt(15);
		System.out.print(s1 +"Length = " +s1.length()+ " Char at (15) :" + c);
		int a = 6/0;
	}
	catch(StringIndexOutOfBoundsException e) {
		System.out.print("Exception occured :");
	}
	catch(ArithmeticException e) {
		System.out.print("\nArithmetic exception "+ e);
	}
	}

}
