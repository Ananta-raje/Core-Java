package com.var;

public class BankAccount {

	static byte age = 28;
	static short branchCode = 1025;
	static int accountNumber = 123456;
	static long accountBalanceNumber = 123456789012L;

	static float interestRate = 6.5f;
	static double balance = 85000.75;

	static char accountType = 'S';
	static boolean active = true;

	static String holderName = "Amit";
	static String bankName;// Predefined class has default value null

	static Car c;// User defined class has by default value null
	static Profile p;// Interface has by default value null

	public static void main(String[] args) {

		// int accountYear; //Local variable must need to initialize
		int accountYear;
		accountYear = 2024;
		double loanAmount = 250000.50;
		char customerType = 'G';
		boolean loanApproved = true;
		String city = "Pune";

		System.out.println("Age is: "+age);
		System.out.println("Branch code is: "+branchCode);
		System.out.println("Account no is : "+ accountNumber);
		System.out.println("Acc bal no: "+accountBalanceNumber);
		System.out.println("Rate of interest: " +interestRate);
		System.out.println("Current balance "+balance);
		System.out.println("Acc type: "+accountType);
		System.out.println("Status: "+active);
		System.out.println("Holder name: "+holderName);
		System.out.println("Bank no"+bankName);
		System.out.println("user defined class has default value: "+c);
		System.out.println("Interface has default valur : "+p);
		System.out.println("Account year: "+accountYear);
		System.out.println("Loan amount"+loanAmount);
		System.out.println("Char type"+customerType);
		System.out.println(loanApproved);
		System.out.println("City is: "+city);
	}
}