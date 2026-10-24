package com.practice;

public class Atm {
	double balance = 10000;
	
	
	
	
	
	
	public void displayMenu() {
		System.out.println("Check Balance");
		System.out.println("Withdraw amount");
		System.out.println("Deposite amount");
		
	}
	
	public double checkBalance() {
		return balance;
	}
	
	public double deposite(double amount) {
		if (amount > 0) {
			balance += amount;
		}
		return balance;
	}
	
	public double withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}else {
			System.out.println("Please enter a valid amount");
		}
		
		return balance;
	}
	
	
	
}
