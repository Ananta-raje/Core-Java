package com.test;

public class Employee {
	private double salary;

	
	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}else {
			System.out.println("Enter valid salary amount");
		}
	}
	
	public double getSalary() {
		return salary;
	}
}
