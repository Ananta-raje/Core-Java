package com.test;

public class Account {
	private double balance;

	public Account(double bal) {
		this.balance = bal;
	}
	
	public void deposit(double bal) {
		if (bal > 0 ) {
			System.out.println("Deposited balance is: "+ bal);
			balance += bal;
			System.out.println("After deposite balance is: "+ balance);
		}else {
			System.out.println("Enter valid deposit amount!");
		}
	}
	
	public void withdraw(double bal) {
		if (bal > 0 && bal <= balance) {
			System.out.println("Withdrawal balance is: "+ bal);
			balance -= bal;
			
			System.out.println("After withdrawal balance is: " + balance);
		}
	}
	
	public double getBalance() {
		return balance;
	}
}
