package com.test;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	
	public double calArea() {
		return length * width;
	}
}
