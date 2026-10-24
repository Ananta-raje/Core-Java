package com.practice;

public class Product {
	int proId;
	int quantity;
	double price;
	int discount;
	
	
	public double calculator(double m1, int q ) {
		double billAmount = m1 * q;
		return billAmount;
	}
	
	
	public double calfinalPrice(double price, int discount ) {
		double finalPrice = price - (price/discount) ;
		return finalPrice;
	}
}
