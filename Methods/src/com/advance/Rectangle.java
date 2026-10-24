package com.advance;

public class Rectangle {
	private double width;
	private double length;

	
	public void setDimensions(double w, double l) {
		width = w;
		length = l;
	}
	
	public double calculateArea() {
		return length * width;
	}
	
	public double calPerimeter() {
		return 2 * (length + width);
	}
	
	public boolean isSquare() {
		if (length == width) {
			return true;
		}
		return false;
	}
	
	
	public void displayDetails() {
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area of rectangle: " + calculateArea());
		System.out.println("Perimeter of rectangle: "+ calPerimeter());
		System.out.println("Whether it is a square : " + isSquare());

	}
	
}
