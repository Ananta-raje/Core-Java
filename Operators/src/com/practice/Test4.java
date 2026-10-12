package com.practice;

public class Test4 {
	public static void main(String[] args) {
		
		int a = 6;
		int b = 3;
		int c = 2;
		
		int result = a + b * c << 1 & 15;
		
		System.out.println(result);
		
		System.out.println(a > b && b < c || a == 6);
		
		System.out.println(a ^ b & c);
	}
}
