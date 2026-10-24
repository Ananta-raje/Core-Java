package com.practice;

public class BankAccount {
	double balance = 5000;
	
	
	
	
	public double withdrawBal(double withdraw) {
		if (withdraw <= balance && withdraw > 0) {
			balance -= withdraw;
		}
		return balance;
	}
}


