package com.loopstatements;

import java.util.Iterator;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1)Write a Java program to print numbers from 10 to 1 using a for loop.
//		for(int i = 10; i >= 1; i-- ) {
//			System.out.println(i);
//		}

		// 2)Write a program to print all even numbers from 2 to 20.
//		for(int i = 2; i <= 20; i++) {
//			
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}

		// 3)Write a program to print all even numbers from 2 to 20. without using
		// updation
//		for(int i = 2; i <= 20; ) {
//			
//				System.out.println(i);
//				
//				i+= 2;
//			
//		}

		// 4)Write a program that initializes two variables, i = 1 and j = 10, in a
		// single for loop.
//		for(int i = 1, j = 10 ; i <= 5 ; i++ , j-- ) {
//			System.out.println(i + "  "+ j);
//		}

		// 5)Write a Java program to print numbers from 1 to 10 using a for loop.
		// Condition: Do not write a condition in the loop header.
//		for(int i = 1 );  System.out.println(i);

		// 6)Write a program to print numbers from 1 to 10 using a for loop.
		// Condition: Do not use an update expression in the loop header.

//	    for(int i = 1 ; i <=10;) {
//	    	System.out.println(i);
//	    	i++;
//	    }

		// 7)Write a Java program to calculate the sum of the digits of a number using a
		// for loop.
//		System.out.print("Enetr number: ");
//		int n = sc.nextInt();
//		int sum = 0;
//		for(; n != 0; n = n / 10) {
//			
//			int digit = n % 10;
//			sum = sum + digit;
//		}
//		
//		System.out.println("Sum of digits : "+ sum);

		// 8)Write a program to reverse an integer using a for loop.

//		int num = 12345;
//		
//		for( ; num !=0; num = num / 10) {
//			
//			int lastDigit = num % 10;
//			System.out.print(lastDigit);
//			
//			
//		}

		// 9)Write a Java program to check whether a number is prime using a for loop.

//		int n = 24;
//		
//		boolean isPrime = true;
//		
//		if(n <= 1) {
//			isPrime = false;
//		}else {
//			for(int i = 2; i < n; i++) {
//				if ( n % i == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//		}
//		
//		if (isPrime) {
//			System.out.println(n + " is a prime number");
//		}else {
//			System.out.println(n + " is not a prime number");
//		}

		// 10)Write a program to calculate the factorial of a number using a for loop.

//		int n = 5;
//		long fact = 1;
//		
//		for(int i = n ; i >=1 ; i--) {
//			fact = fact * i;
//		}
//		System.out.println("Factorial: "+ fact);

		// 11)Write a program to print the multiplication table of a number from 10 down
		// to 1.

//		int n = 5;
//		for(int  i = 10; i >= 1; i-- ) {
//			System.out.println( n + " * " + i + " = " +( n * i));
//		}

		// 12)Write a program to print the following pattern using nested for loops.
//		*
//		**
//		***
//		****
//		*****

//		for(int i = 1 ; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 13)Write a program to generate this pattern:

//		*****
//		****
//		***
//		**
//		*

//		for(int  i = 5; i >= 1; i--) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 14)Write a program to print:

//		1
//		12
//		123
//		1234
//		12345

//		for(int i = 1 ; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

		// 15)Write a program to generate the following pattern:Print a pyramid
		//
		// *
		// ***
		// *****
		// *******
		// *********

//		for( int i = 1 ; i <= 5; i++) {
//			
//			//print space
//			for(int j = 1; j <= (5 - i); j++) {
//				System.out.print(" ");
//			}
//			
//			//print star
//			for(int k = 1; k <= (2 * i -1); k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}

		// 16)Write a program to print multiplication tables from 1 to 5, with each
		// table running from 1 to 5.

//		int n = 5;
//		for (int i = 1; i <= 5; i++) {
//			n = i;
//			for (int j = 1; j <= 5; j++) {
//				System.out.print( n * j + " ");
//				
//			}
//			System.out.println();
//		}

		// 17)Is the following code valid or invalid? If valid, explain its execution
		// and output.
//		for (int i = 1, j = 5; i <= 5; i++, j--) {
//		    System.out.println(i + " " + j); //valid
//		}

		// or
//		for (int i = 1, j = 5; i <= 5 && j > 0; i++, j--) {
//		    System.out.println(i + " " + j);  //valid
//		}

		// 18)Is the following code valid or invalid? Explain why.
//		int i = 1;
//		int j = 5;
//
//		for (; i <= 5 && j > 0; i++, j--) {
//		    System.out.println(i + " " + j);//valid
//		}

		// 19)Empty body for loop : Write a Java program that calculates the sum of
		// numbers from 1 to 100 using an empty loop body.
		// Restriction: Do not use {} to create a block body.

//			int sum = 0;
//			for (int i = 1; i <= 100; i++)
//				sum += i;
//			System.out.println(sum);
		
		//19)Write a program to print all factors of a given positive integer using a for loop.
		
//		int n = 12;
//		
//		for(int i = 1; i <= n ;i++) {
//			if (n % i == 0 ) {
//				System.out.print(i +" ");
//			}
//		}
		
		
		//20)Write a Java program to check whether a number is perfect using a for loop.
//		int n = 28;
//		int sum = 0;
//		
//		for(int i = 1; i < n ;i++) {
//			if (n % i == 0 ) {
//				   sum += i;
//				
//			}
//		}
//		
//		if (sum == n) {
//			System.out.println(n +" is a perfect number");
//		}else {
//			System.out.println(n + " Not a perfect nunmber");
//		}
		
		//21)Write a Java program to find the greatest common divisor (GCD) of two positive integers using a for loop.
		
//		int a = 24;
//		int b = 36;
		
		
		//22)Write a Java program to print a hollow square of size 5 using nested for loops.
		//23)Write a Java program to print all prime numbers between 1 and 100.
		
		

	}
}
