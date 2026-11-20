package com.tka.methodoveriding;

public class Upi extends Payment {
	@Override
	void pay() {
		System.out.println("Payment through UPI");
	}
}
