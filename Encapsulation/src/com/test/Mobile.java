package com.test;

public class Mobile {
	private String model;
	private double price;
	
	
	public Mobile(String model, double price) {
		this.model = model;
		this.price = price;
	}
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double discount() {
		double discountAmo = price * 10 / 100;
		double discountedPrice = price - discountAmo;
		
		return discountedPrice;
	}

	
	
}
