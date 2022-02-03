package com.psk;





public class Employee {
	int emp_id;
	String name;
	Address ad; //reference to obj shld create address and emplyee obj //obj of address class
	float basic_sal;
	
	public Employee(int emp_id, String name, Address ad, float basic_sal) {
		
		this.emp_id = emp_id;
		this.name = name;
		this.ad = ad;
		this.basic_sal = basic_sal;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", ad=" + ad + ", basic_sal=" + basic_sal + "]";
	}
	
}




