package com.psk;



public class MyMain {
	public static void main(String[] args) {
		
		Address address = new Address("Gandhi Nagar","Ahmedabad","Gujarat");
		
		Employee e1 = new Employee(450,"Ayaan",address ,25000);
		
		
		System.out.println(e1);
	}
}
