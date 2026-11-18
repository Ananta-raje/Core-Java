package com.tka.practice;


class LivingThing{
	void IsLiving() {
		System.out.println("Living thing");
	}
}
public class Animal extends LivingThing {
	void eat() {
		System.out.println("Animal eating");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog is barking!!");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("Meioeee");
	}
}

class Tiger extends Cat{
	void type() {
		System.out.println("Tigerr");
	}
}
