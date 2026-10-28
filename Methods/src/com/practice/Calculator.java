package com.practice;

public class Calculator {

	int a;
	int b;

	void setOperands(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return a + b;
	}

	public int sub() {
		return a - b;
	}
	
	
	public double multiply() {
		return a * b;
		
	}
	
	public double divide() {
		return a / b;
	}
	
	
	
}
