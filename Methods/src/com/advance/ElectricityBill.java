package com.advance;

public class ElectricityBill {
	private String customerName;
	private int unitsConsumed;
	private double billAmount;

	public void setDetails(String name, int unitsCon) {
		if (name != null && !name.trim().isEmpty() && unitsCon >= 0) {
			this.customerName = name;
			this.unitsConsumed = unitsCon;
		}else {
			System.out.println("Invalid input details!!");
		}
	}

	public double calculateBill() {

		if (unitsConsumed <= 100) {
			billAmount = unitsConsumed * 2;
		} else if (unitsConsumed <= 200) {
			billAmount = 100 * 2 + (unitsConsumed - 100) * 3;
		} else {
			billAmount = 100 * 2 + 100 * 3 + (unitsConsumed - 200) * 5;
		}

		return billAmount;

	}

	public void displayDetails() {
		System.out.println("Customer name: " + customerName);
		System.out.println("Units consumed: " + unitsConsumed);
		System.out.println("Bill amount: " + "RS." + calculateBill());
	}
}
