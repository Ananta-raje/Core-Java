package com.advance;

public class Product {

	private int productId;
	private String productName;
	private double price;
	private int quantity;

	public void setProductDetails(int proId, String proName, double p, int q) {
		if (proId > 0 && proName != null && !proName.isBlank() && p >= 0 && q >= 0) {
			productId = proId;
			productName = proName;
			price = p;
			quantity = q;
		} else {
			System.out.println("Invalid product details!!");
		}
	}

	public void addStock(int stock) {
		if (stock <= 0) {
			System.out.println("Stock quantity must be greater then zero!!");
		} else {
			quantity += stock;
			System.out.println("Stock added successfully!");
			System.out.println("Updated quantity: " + quantity);
		}
	}

	public boolean sellProduct(int sellQun) {
		if (sellQun < 0) {
			System.out.println("Selling quantity must be greater then zero!!");
			return false;
		}
		if (sellQun > quantity) {
			System.out.println("Insufficient Stock!!");
			return false;
		}
		
		quantity -= sellQun;
		System.out.println("Stock added sucessfully!!");
		System.out.println("Remaining quantity: " + quantity);
		return true;
		
	}

	public double calculateInventoryValue() {
		return price * quantity;
	}

	public void displayProductDetails() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product price: " + price);
		System.out.println("Product quantity: " + quantity);
		System.out.println("Inventory Value: ₹" + calculateInventoryValue());

	}

}
