package com.tka.methodoveriding;

public class DebitCard extends Payment {
	@Override
	void pay() {
		System.out.println("Payment through Debit Card");
	}
}
