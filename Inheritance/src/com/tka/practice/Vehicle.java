package com.tka.practice;

public class Vehicle {
	void start() {
		System.out.println("Start");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Car drive");
	}
}

class SportsCar extends Car{
	void run() {
		System.out.println("Run fast");
	}
}
