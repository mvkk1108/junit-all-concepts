package com.mdu005.juit;

public class EmployeeDemo {

	public static void main(String[] args) {
	Employee emp1 = new Employee(102, "krishna", 30, 30000.00);
	Employee emp2 = new Employee(102, "krishna", 30, 30000.00);

	System.out.println(emp1);
	System.out.println(emp2);
	System.out.println(emp1.equals(emp2));
	}

}
