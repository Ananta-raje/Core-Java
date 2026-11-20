package com.tka.methodoverloading;

public class Shopping {
	int proId;
	String proName;
	int quantity;
	int discount;

	void purchase(int proId) {

	}

	void purchase(int proId, int quantity) {

	}

	void purchase(int proId, int quantity, int discount) {

	}

	void purchase(String proName, int quantity) {

	}
}

class User{
	Shopping s1 = new Shopping();
	
}
