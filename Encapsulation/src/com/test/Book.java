package com.test;

public class Book {
	private String title;
	private double price;

	public Book(String title, double price) {
		this.title = title;
		this.price = price;

	}
	
	public void bookInfo() {
		System.out.println("Book title is: "+ title);
		System.out.println("Book price is: " + price);
	}
}
