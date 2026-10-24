package com.advance;

public class Employee {
	private int employeeId;
	private String name;
	private double basicSalary;
	
	private static final double HRA_RATE = 20.0;
	private static final double DA_RATE = 10.0;
	
	
	public void setEmpDetails(int e, String n, double b) {
		
		employeeId = e;
		name = n;
		basicSalary = b;
	}
	
	public double calHra() {
		return (basicSalary / 100) * HRA_RATE;
	}
	public double calDa() {
		return (basicSalary / 100) * DA_RATE;
	}
	
	public double grossSalary() {
		return calHra() + calDa() + basicSalary;
	}
	
	public void displayDetails() {
		System.out.println("Employee name: " + name);
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Basic salary: " + basicSalary);
		System.out.println("HRA : " + calHra());
		System.out.println("DA : " + calDa());
		System.out.println("Gross salary: "+ grossSalary());


	}
}
