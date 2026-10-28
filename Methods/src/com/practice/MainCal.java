package com.practice;

import java.util.Scanner;

public class MainCal {
	public static void main(String[] args) {
		Calculator c = new Calculator();

		Scanner sc = new Scanner(System.in);

		System.out.println("---------> Calculator <------------");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");

		System.out.print("Choose operation: ");
		int choice = sc.nextInt();

		//User input 
		System.out.println("Enter values: ");

		System.out.println("Enter a: ");
		int a = sc.nextInt();

		System.out.println("Enter b: ");

		int b = sc.nextInt();

		c.setOperands(a, b);

		switch (choice) {
		case 1:
			System.out.println("Addition of a and b is : "+c.add());
			break;
		case 2:
			System.out.println("Subtraction of a and b is : "+c.sub());
			break;
		case 3:
			System.out.println("Multiplication of a and b is : "+c.multiply());
			break;
		case 4:
			System.out.println("Division of a and b is : "+c.divide());
			break;

		default:
			break;
		}
	}
}
