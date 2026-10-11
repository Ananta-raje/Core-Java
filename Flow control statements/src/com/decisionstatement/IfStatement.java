package com.decisionstatement;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		
//		//1)Write a Java program to check whether a number is positive.
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		if (a > 0) {
//			System.out.println("Positive number");
//		}
		
		
		//2)Write a Java program to check whether a number is even.
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		if (n % 2 == 0) {
//			System.out.println("Even number");
//		}
		
		
		//3)Write a Java program to check whether a number is positive or negative.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		if (n > 0) {
//			System.out.println("Positive Number");
//		}else {
//			System.out.println("Negative Number");
//		}
		
		
		
		//4)Write a Java program to find the greater of two numbers.
//		int a = 25;
//		int b = 40;
//		
//		if (a >= b) {
//			System.out.println( "a is greater or equal to b ");
//		}else {
//			System.out.println("b is greater or equal to a");
//		}
		
		
		//5)Find the greatest of three numbers
		
//		int a = 90;
//		int b = 70;
//		int c = 45;
//		
//		
//		if (a > b && a > c) {
//			System.out.println("a is greater");
//		}else if(b > a && b > c) {
//			System.out.println("b is greater");
//		}else {
//			System.out.println("c is greater");
//		}
		
		//6)Write a Java program to determine whether a given year is a leap year.
		
//		Scanner sc  = new Scanner(System.in);
//		
//		long n = sc.nextLong();
//		
//		if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
//			System.out.println("Leap year");
//		}else {
//			System.out.println("Not a leap year");
//		}
		
		//7)Write a Java program to determine whether a student is eligible to sit for an examination.
//		Scanner sc  = new Scanner(System.in);
//		
//		int attendence = sc.nextInt();
//		
//		boolean feesPaid = sc.nextBoolean();
//		
//		if (attendence >= 75) {
//			if (feesPaid) {
//				System.out.println("Eligible for examination");
//			}else {
//				System.out.println("Please pay your fees");
//			}
//		}else {
//			System.out.println("Not eligible due to low attendence");
//		}
		
		//8)Write a Java program to determine a customer's electricity bill discount.
		
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		
//		int billAmount = sc.nextInt();
//		
//		
//		if (age >= 60 && billAmount >= 2000) {
//			System.out.println("Eligible for 20% discount");
//		}else if(age >= 60) {
//			System.out.println("Eligible for 10% discount");
//		}else if(billAmount >= 5000) {
//			System.out.println("Eligible for 5% discount");
//		}else {
//			System.out.println("Not eligible");
//		}
		
		
		//9)Write a Java program to validate a user's login credentials.
		
//		Scanner sc  = new Scanner(System.in);
//		
//		String username = sc.next();
//		
//		String password = sc.next();
//		
//		boolean isActive = sc.nextBoolean();
//		
//		
//		if (username.equals("admin")) {
//			
//			if (password.equals("Java@123")) {
//				 
//				if (isActive) {
//					System.out.println("Login succesfully!!");
//				}else {
//					System.out.println("Account is inactive!!");
//				}
//			}else {
//				System.out.println("Invalid password");
//			}
//			
//		}else {
//			System.out.println("Invalid username!!");
//		}
		
		//10)Write a Java program that accepts electricity units consumed and calculates the bill.

//		Scanner sc = new Scanner(System.in);
//		
//		int units = sc.nextInt();
//		int bill;
//		
//		if (units >= 0 && units <= 100) {
//			bill = units * 2;
//		}else if ( units <= 200) {
//			bill = units * 3;
//		}else {
//			bill = units * 5;
//		}
//		
//		System.out.println("Electricity bill: "+ bill);
		
		//11)Write a Java program that checks whether a customer can withdraw money from an ATM.
//		Scanner sc = new Scanner(System.in);
//		
//		
//		long balance = 50000;
//		
//		int pin = sc.nextInt();
//		if (pin == 1234) {
//			long withdrawal = sc.nextLong();
//			if (withdrawal > 0) {
//				if (balance >= withdrawal) {
//					System.out.println("Withdrawal successfully");
//				}else {
//					System.out.println("Insufficent balance");
//				}
//			}else {
//				System.out.println("Invalid withdrawal amount");
//			}
//		}else {
//			System.out.println("Incorrect PIN");
//		}

		
	}
}
