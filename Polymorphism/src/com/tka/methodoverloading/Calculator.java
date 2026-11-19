package com.tka.methodoverloading;

public class Calculator {
	
	static Integer a = 10;
	static String s = "Java";
	

	//1
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	//2
	static int multiply(int a, int b) {
		return a * b;
	}
	static double multiply(double a, double b) {
		return a * b;
	}
	
	//3
	static double area(int r) {
		return 3.14 * r * r;
	}
	static int area(int h, int b) {
		return h * b;
	}
	
	//4
	static void display() {
		System.out.println("Integer value: "+ a);
		System.out.println("String  value: "+ s);

	}
	
	//5
	static int sum(int a, int b) {
		return a + b;
	}
	static float sum(float a, float b) {
		return  a + b;
	}

	
	//10
	static int calculate(int n) {
		return n * n;
	}
	
	static long calculate(long n) {
		return n * n * n;
	}
	
	
	//11
	static int max(int a, int b) {
		return Math.max(a, b);
	}
	
	static int max(int b, long c) {
		return (int) Math.max(a, c);
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		long aa = 25;

		System.out.println(add(a, b));
		System.out.println(add(a, b, c));
		
		System.out.println(multiply(a, b));
		System.out.println(multiply(a, b));	
		
		System.out.println(area(c));
		System.out.println(area(c, b));
		
		display();
		
		System.out.println(sum(a, b));
		System.out.println(sum(a, b));
		
		System.out.println(calculate(a));
		System.out.println(calculate(aa));
		
		System.out.println(max(a, b));
		System.out.println(max(a, aa));
	}
}
