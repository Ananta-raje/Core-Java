package com.tka.methodoverloading;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Main method");
		main(2);
		main("aa");
	}

	public static void main(String a) {
		System.out.println("Overloaded main method");
	}

	public static void main(int b) {
		System.out.println("Overloaded main method");
	}
}
