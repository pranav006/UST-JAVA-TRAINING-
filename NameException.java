package com.psk.ust.A1;

import java.util.Scanner;

public class NameException extends Exception {
	NameException(){ }
	NameException(String s){
		super(s);
	}
	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name = c.nextLine();
		try {
			if(name.length() > 10) {
				NameException S = new NameException(name + " has more than 10 characters");
				throw S;
			}
			else {System.out.print(name);}
		}
		catch(NameException e) {
			e.printStackTrace();
		}c.close();
	}
}



