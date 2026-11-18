package com.tka.practice;

class GrandParent {
	int z = 5;
}

public class Parent extends GrandParent {
	int x = 10;

	void p() {
		System.out.println("Parent class");
	}
}

class Child extends Parent {
	int y = 20;

}

class Child1 extends Parent {

}

class Child2 extends Parent {

}
