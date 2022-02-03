package com.psk;

import java.util.Scanner;

public class Address {
	
	String loc;
	String city;
	String state;
	
	public Address(String loc, String city, String state) {
		Scanner c = new Scanner(System.in);
		this.loc = loc;
		this.city = city;
		this.state = state;
		System.out.print("Enter the Location ");
		loc = c.nextLine();
		System.out.print("Enter the City ");
		city = c.nextLine();
		System.out.print("Enter the State ");
		state = c.nextLine();

	}

		return "Address [loc=" + loc + ", city=" + city + ", state=" + state + "]";
	}
	
}
