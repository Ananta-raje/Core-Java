package com.test;

public class BankAccount {
	private double balance = 10000;

	public double getBalance() {
		return balance;
	}

	public double deposit(double bal) {
		if (bal > 0 ) {
			balance += bal;
			return balance;
		}
		return 0;
	}
	
	public double withdraw(double bal) {
		if (bal > 0 && bal <= balance) {
			balance -= bal;
			return balance;
		}
		return 0;
		
	}
	
	
	
	
}
