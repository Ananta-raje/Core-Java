package com.tka.practice;

public class A {

	int a = 100;

	void showA() {
		System.out.println("A is running");
	}

	void m1() {
		System.out.println("m1");
	}
}

class B extends A {
	int b = a * 2;

	void showB() {
		System.out.println("B is running");
	}

	void m2() {
		System.out.println("m2");
	}
}

class C extends B {
	void showC() {
		System.out.println("C is running");
	}

	void m3() {
		System.out.println("m3");
	}
}
