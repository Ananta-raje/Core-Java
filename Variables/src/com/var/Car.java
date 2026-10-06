package com.var;

public class Car {

	static byte seats;
	static short modelYear;
	static int carNumber;
	static long chassisNumber;

	static float mileage;
	static double price;

	static char fuelType;
	static boolean old;

	static String brand;
	static String model;

	static int engineCC = 1998;
	static double speed = 180.5;
	static char safetyRating = 'A';
	static boolean available = true;

	static String color = "White";

	static Product p;// User defined class
	static Profile pr;// User defined Interface

	public static void main(String[] args) {

		System.out.println(seats);
		System.out.println(modelYear);
		System.out.println(carNumber);
		System.out.println(chassisNumber);
		System.out.println(mileage);
		System.out.println(price);
		System.out.println(fuelType);

		System.out.println(brand);
		System.out.println(model);
		System.out.println(engineCC);
		System.out.println(speed);
		System.out.println(safetyRating);
		System.out.println(available);
		System.out.println(color);
		
		System.out.println(p);
		System.out.println(pr);
	}
}