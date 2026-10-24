package com.practice;

public class Employee {
	String empName  = "Ananta";
	double salary = 35000;
	int exp ;
	
	
	public double empBonusCal(double salary, int exp) {
		
		double bonus = 0;
		if (exp >= 5) {
		  bonus = salary / 100 * 10;
		}else if (exp >= 3 && exp <= 4) {
			bonus = salary / 100 * 3;
		}else {
			System.out.println("No bonus");
		}
		return bonus;
	}
	
}
