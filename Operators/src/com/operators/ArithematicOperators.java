package com.operators;

public class ArithematicOperators {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		

		System.out.println("Addition of two numbers "+a+" and "+b+ " is : "+(a + b));
		System.out.println("Subtraction of two numbers "+a+" and "+b+ " is : "+(a - b));
		System.out.println("Multiply of two numbers "+a+" and "+b+ " is : "+(a * b));
		System.out.println("Division of two numbers "+a+" and "+b+ " is : "+(a / b));
		System.out.println("Modulus of two numbers "+a+" and "+b+ " is : "+(a % b));
		
//		System.out.println("Hii"+ a - b);// This will give compile time error because a string cannot subtract from a variable 
		//Java evaluates operators from left to right
	}
}
