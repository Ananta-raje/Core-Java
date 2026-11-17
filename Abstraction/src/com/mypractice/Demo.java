package com.mypractice;

public class Demo {
	public static void main(String[] args) {
		Car c = new ElectricCar();
		c.start();
		c.accelerate();
		c.brake();

		Car c1 = new FuelCar();
		c.start();
		c.accelerate();
		c.brake();
	}
}

abstract class Car {
	void start() {
		System.out.println("Car is started!!");
	}

	abstract void accelerate();

	abstract void brake();
}

class ElectricCar extends Car {
	@Override
	void accelerate() {
		System.out.println("Electric car is accelerating!!");
	}

	@Override
	void brake() {
		System.out.println("Electric car is stoped!!");
	}
}

class FuelCar extends Car {
	@Override
	void accelerate() {
		System.out.println("Fuel car is accelerating!!");

	}

	@Override
	void brake() {
		System.out.println("Fuel car is stoped!!");
	}
}
