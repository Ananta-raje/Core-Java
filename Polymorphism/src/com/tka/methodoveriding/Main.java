package com.tka.methodoveriding;

class Animal {
	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal {

	@Override
	void sound() {
		System.out.println("Dogs barks");
	}
}

class Cats extends Animal {
	@Override
	void sound() {
		System.out.println("Cats meoww");
	}
}

public class Main {

	public static void main(String[] args) {

		// Runtime polymorphism
		Payment p;
		Animal a;

		p = new Payment();
		p.pay();

		p = new Upi();//Dynamic Method Dispatch is the mechanism through which Java determines which overridden method should execute at runtime based on the actual object type.
		p.pay();

		p = new CreditCard();
		p.pay();

		p = new DebitCard();
		p.pay();

		a = new Animal();
		a.sound();

		a = new Dog();
		a.sound();
		
		a = new Cats();
		a.sound();

	}
}
