package com.tka.methodoverloading;

public class Demo {

	static void show(int age, String name) {
		System.out.println("Age is: " + age);
		System.out.println("Name is: " + name);
	}

	static void show(String name, int age) {
		System.out.println("Age is: " + age);
		System.out.println("Name is: " + name);
	}

	public static void main(String[] args) {
		show(22, "Ananta");
		show("Ananta", 22);
	}
}
