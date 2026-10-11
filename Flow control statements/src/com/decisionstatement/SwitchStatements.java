package com.decisionstatement;

import java.util.Scanner;

public class SwitchStatements {
	public static void main(String[] args) {
		
		//1)Write a Java program that accepts an integer from 1 to 7 and prints the corresponding day using a switch statement.
//		Scanner sc = new Scanner(System.in);
//		
//		int week = sc.nextInt();
//		switch (week) {
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		default:
//			System.out.println("Invalid day number");
//			break;
//		}
		
		//2)Write a Java program that takes two numbers and an operator, then performs the selected arithmetic operation using switch.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter second number: ");
		
		int b = sc.nextInt();
		
		System.out.print("Enter operator: ");
		char operator = sc.next().charAt(0);
		
		int result;
		
		switch (operator) {
		case '+':
			result = a + b;
			System.out.println("Result is : " + result);
			break;
		
		case '-':
			result = a - b;
			System.out.println("Result is : " + result);
			break;
		case '*':
			result = a * b;
			System.out.println("Result is : " + result);
			break;
		case '/':
			if (b != 0) {
		        result = a / b;
		        System.out.println("Result is: " + result);
		    } else {
		        System.out.println("Cannot divide by zero");
		    }
			break;

		default:
			System.out.println("Invalid operator");
			break;
		}
		
		
		
		
		
	}
}
