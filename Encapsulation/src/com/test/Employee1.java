package com.test;

public class Employee1 {
	String name;
	private double salary;

	public Employee1(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public double increment() {
	 double increSalary = (salary * 10 /100);
	 return increSalary;
	}
	
	
	public double finalSalry() {
		double finalSalary = salary + increment();
		return finalSalary;
	}
	
	
}
