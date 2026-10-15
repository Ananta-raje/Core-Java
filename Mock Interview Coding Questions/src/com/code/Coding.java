package com.code;

import java.util.Scanner;

public class Coding {
	
	
	

	
	//Mock 1
// 1)print prime numbers from 100 to 1
//			public static void main(String[] args) {
//				int n = 100;
//				int count = 0;
//				for (int i = n; i >= 2; i--) {
//					boolean isPrime = true ;
//					for (int j = 2; j < i; j++) {
//						if (i % j == 0) {
//							isPrime = false;
//							break;
//						}
//					}
//					
//					if (isPrime) {
//						count++;
//						System.out.println(i);
//					}
//				}
//				System.out.println(count);
//			}

// 2)Swap two numbers without using third variable
			
//			public static void main(String[] args) {
//				int a  = 10;
//				int b = 6;
//				
//				a = a + b;
//				b = a - b;
//				a = a - b;
//				
//				System.out.println(a);
//				System.out.println(b);
//			}
	
	
	//Mock 2

	//3)Area of circle
	
	public static void main(String[] args) {
		
		System.out.print("Enter radius: ");
		Scanner sc = new Scanner(System.in);
		int rad = sc.nextInt();
		
		float pi =  3.14f;
		
		double area = pi * rad * rad;
		
		System.out.println("The area of circle is : "+ area);
	}
	
	
	
	
		
}
