package com.advance;

public class BankAccount {

	private String accountHolderName;
	private long accountNumber;
	private double balance;

	public void setAccountDetails(long accNo, String name, double bal) {

		if (accNo > 0 && name != null && !name.isBlank() && bal >= 0) {
			accountNumber = accNo;
			accountHolderName = name;
			balance = bal;
		} else {
			System.out.println("Invalid account details!");
		}

	}

	public void deposit(double depoAmo) {
		if (depoAmo > 0) {
			System.out.println(accountHolderName + " deposit: " + depoAmo);
			balance += depoAmo;
			System.out.println("-->After deposit: " + balance);
		}

	}

	public void withdraw(double withAmo) {
		if (withAmo <= 0) {
	        System.out.println("Withdrawal amount must be greater than zero.");
	    } else if (withAmo > balance) {
	        System.out.println("Insufficient balance!");
	    } else {
	        balance -= withAmo;
	        System.out.println("Withdrawal successful: " + withAmo);
	        System.out.println("Remaining balance: " + balance);
	    }

	}

	public double checkBalance() {
		return balance;
	}

	public void displayAccountDetails() {
		System.out.println("Account holder name : " + accountHolderName);
		System.out.println("Account no: " + accountNumber);
		System.out.println("Initial balance: " + balance);
	}

}
