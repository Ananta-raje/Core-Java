package com.practice;

import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
     		Scanner sc = new Scanner(System.in);
		// 1)Write a Java program to check if a number is positive.

//		int a = sc.nextInt();
//		if (a > 0) {
//			System.out.println("Positive number");
//		}

		// 2)Write a program to check if a number is divisible by 5.

//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		if (n % 5 == 0) {
//			System.out.println("Divisible by 5");
//		}else {
//			System.out.println("Not divisible by 5");
//		}

		// 3)Write a program to check if a number is greater than 100.

//		int a = 10;
//		
//		if (a > 100) {
//			System.out.println("Given number is greater then 100");
//		}else {
//			System.out.println("The given number is not greater then 100");
//		}

		// 4)Write a program to check if a character is uppercase.

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter character: ");
//		
//		char ch = sc.next().charAt(0);
//		
//		if (ch >= 'A' && ch <= 'Z') {
//			System.out.println("Uppercase");
//		}else {
//			System.out.println("Lowercase");
//		}

		// 5)Write a program to check if a person is eligible for voting (age ≥ 18).

//		Scanner sc = new Scanner(System.in);
//		
//		int age = sc.nextInt();
//		if (age >= 18  && age <= 100) {
//			System.out.println("Eligible for voting!!");
//		}else {
//			System.out.println("Not eligible for voting!!");
//		}

		// 6)Write a program to check whether a number is even or odd.

//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		if (n % 2 == 0) {
//			System.out.println("Even number!!");
//		}else {
//			System.out.println("ODD number!!");
//		}

		// 7)Write a program to find the greater number between two numbers.
//		int a = 10;
//		int b = 1;
//		
//		if (a > b) {
//			System.out.println("a is greater then b");
//		}else if (b > a) {
//			System.out.println("b is greater then a");
//		}else {
//			System.out.println("Both are equal");
//		}

		// 8)Write a program to check whether a number is positive or negative.

//		Scanner sc  = new Scanner(System.in);
//		
//		System.out.print("Enetr no: ");
//		int n = sc.nextInt();
//		
//		if (n > 0) {
//			System.out.println("The number is positive number!!");
//		}else if (n < 0) {
//			System.out.println("The number is negative number!!");
//		}else {
//			System.out.println("The number is zero!!");
//		}

		// 9)Write a program to check whether a character is vowel or consonant.

//		Scanner sc  = new Scanner(System.in);
//		
//		System.out.print("Enter character: ");  
//		char ch = sc.next().charAt(0);
//		
//		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U') {
//			System.out.println("Vowel");
//		}else {
//			System.out.println("Consonant");
//		}

		// 10)Write a program to check whether a number is divisible by 2 or not.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter no: ");
//		
//		int n = sc.nextInt();
//		
//		if (n % 2 == 0) {
//			System.out.println("The given number is divisible by 2 ");
//		}else {
//			System.out.println("Not divisible by 2");
//		}
		// 11)Write a program to find the largest among three numbers.

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter first number: ");
//
//		int a = sc.nextInt();
//
//		System.out.print("Enter Second number: ");
//
//		int b= sc.nextInt();
//		
//		System.out.print("Enter Third number: ");
//		
//		int c = sc.nextInt();
//		
//		if (a > b && a > c) {
//			System.out.println(a +" is greater ");
//		}else if (b > c) {
//			System.out.println(b+ " is greater");
//		}else {
//			System.out.println(c+ " is greater");
//		}
//		
		// 12)Write a program to display grade based on marks.

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter marks: ");
//		
//		int marks = sc.nextInt();
//		
//		if (marks >= 75 && marks <= 100) {
//			System.out.println("Distinction");
//		}else if (marks >= 60 ) {
//			System.out.println("First class");
//		}else if (marks >= 50) {
//			System.out.println("Second class");
//		}else if (marks >= 35) {
//			System.out.println("Pass");
//		}else {
//			System.out.println("Fail");
//		}

		// 13)Write a program to check whether a character is vowel, consonant, digit,
		// or special character.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a character: ");
//		char ch = sc.next().charAt(0);
//		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
//					|| ch == 'O' || ch == 'U') {
//				System.out.println("Vowel");
//			} else {
//				System.out.println("Consonant");
//			}
//		} else if (ch >= '0' && ch <= '9') {
//			System.out.println("Digit");
//		} else {
//			System.out.println("Special Character");
//		}

		// 14Write a program to display day name based on day number (1–7).
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter day number (1-7): ");
//		int day = sc.nextInt();
//		if (day == 1) {
//			System.out.println("Monday");
//		} else if (day == 2) {
//			System.out.println("Tuesday");
//		} else if (day == 3) {
//			System.out.println("Wednesday");
//		} else if (day == 4) {
//			System.out.println("Thursday");
//		} else if (day == 5) {
//			System.out.println("Friday");
//		} else if (day == 6) {
//			System.out.println("Saturday");
//		} else if (day == 7) {
//			System.out.println("Sunday");
//		} else {
//			System.out.println("Invalid day number");
//		}

		// 15)Write a program to calculate electricity bill based on units.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter electricity units: ");
//		int units = sc.nextInt();
//		double bill;
//		if (units < 0) {
//			System.out.println("Invalid units");
//		} else if (units <= 100) {
//			bill = units * 5;
//			System.out.println("Electricity Bill: ₹" + bill);
//		} else if (units <= 200) {
//			bill = units * 7;
//			System.out.println("Electricity Bill: ₹" + bill);
//		} else {
//			bill = units * 10;
//			System.out.println("Electricity Bill: ₹" + bill);
//		}

		// 16)Write a program to check whether a number is positive and even.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		int num = sc.nextInt();
//		if (num > 0 && num % 2 == 0) {
//			System.out.println("The number is positive and even.");
//		} else {
//			System.out.println("The number is not positive and even.");
//		}

		// 17)Write a program to check whether a person is eligible for a loan.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter your age: ");
//		int age = sc.nextInt();
//		System.out.print("Enter your salary: ");
//		double salary = sc.nextDouble();
//		if (age >= 21 && salary >= 25000) {
//			System.out.println("You are eligible for a loan.");
//		} else {
//			System.out.println("You are not eligible for a loan.");
//		}

		// 18)Write a program to check whether a year is a leap year.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a year: ");
//		int year = sc.nextInt();
//		if (year <= 0) {
//			System.out.println("Invalid year.");
//		} else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//			System.out.println(year + " is a leap year.");
//		} else {
//			System.out.println(year + " is not a leap year.");
//		}
		// 19)Write a program to check login authentication (username and password).
//		Scanner sc = new Scanner(System.in);
//		
//		String correctUsername = "admin";
//		
//		String correctPassword = "java123";
//		
//		System.out.print("Enter username: ");
//		
//		String username = sc.nextLine();
//		System.out.print("Enter password: ");
//		String password = sc.nextLine();
//		if (username.equals(correctUsername) && password.equals(correctPassword)) {
//			System.out.println("Login successful!");
//		} else {
//			System.out.println("Invalid username or password.");
//		}
		// 20)Write a program to check whether a number is divisible by both 3 and 5.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter a number: ");
//		
//		int num = sc.nextInt();
//		if (num % 3 == 0 && num % 5 == 0) {
//			System.out.println("The number is divisible by both 3 and 5.");
//		} else {
//			System.out.println("The number is not divisible by both 3 and 5.");
//		}

		// 21)ATM Withdrawal
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter account balance: ");
//		
//		double balance = sc.nextDouble();
//		
//		System.out.print("Enter withdrawal amount: ");
//		
//		int amount = sc.nextInt();
//		
//		if (balance >= amount) {
//			if (amount % 100 == 0 && amount > 0) {
//				System.out.println("Withdrawal successful.");
//				System.out.println("Remaining balance: ₹" + (balance - amount));
//			} else {
//				System.out.println("Invalid denomination.");
//			}
//		} else {
//			System.out.println("Insufficient balance.");
//		}

		// 22)Electricity Bill
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter electricity units: ");
//		int units = sc.nextInt();
//		
//		double bill;
//		
//		if (units >= 0) {
//			if (units <= 100) {
//				bill = units * 5;
//			} else if (units <= 200) {
//				bill = units * 7;
//			} else {
//				bill = units * 10;
//			}
//			System.out.println("Electricity Bill: ₹" + bill);
//		} else {
//			System.out.println("Invalid units.");
//		}

		// 23)Online Shopping Discount
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter shopping amount: ");
//		double amount = sc.nextDouble();
//		
//		System.out.print("Are you a member? (yes/no): ");
//		String membership = sc.next();
//		
//		double discount = 0;
//		
//		if (amount > 1000) {
//			if (membership.equalsIgnoreCase("yes")) {
//				discount = amount * 0.20;
//			} else {
//				discount = amount * 0.10;
//			}
//		} else {
//			discount = 0;
//		}
//		
//		double finalAmount = amount - discount;
//		System.out.println("Discount: ₹" + discount);
//		System.out.println("Final Amount: ₹" + finalAmount);

		// 24)Age Category + Ticket Price
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter your age: ");
//		int age = sc.nextInt();
//		
//		if (age < 0) {
//			System.out.println("Invalid age.");
//		} else if (age >= 18) {
//			if (age >= 60) {
//				System.out.println("Category: Senior Citizen");
//				System.out.println("Ticket Price: ₹100 (Senior Discount)");
//			} else {
//				System.out.println("Category: Adult");
//				System.out.println("Ticket Price: ₹200 (Normal Price)");
//			}
//		} else {
//			System.out.println("Category: Child");
//			System.out.println("Ticket Price: ₹100 (Child Ticket)");
//		}

		// Practice session- 13/10/2026

		// 1)Write a program that check if a persons age is greater 18, then
		// print"Adult"
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Enter age: ");
//		int age = sc.nextInt();
//
//		if (age > 18 && age <= 100) {
//			System.out.println("Adult");
//		} else {
//			System.out.println("Invalid age");
//		}

		// 2)Write a program to check wheather a number is divisible by 10?
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Enter number: ");
//		int n = sc.nextInt();
//		
//		if (n % 10 == 0) {
//			System.out.println("The number is divisible by 10!!");
//		}else {
//			System.out.println("Not divisible by 10!!");
//		}

		// 3)Write a program to check wheather a temperature is above 30c , then print
		// "Hot day"
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter temp: ");
//		int temp = sc.nextInt();
//		
//		if (temp > 30) {
//			System.out.println("Hot day!!");
//		}

		// 4)Write a program to check wheather a number is even or add
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter number: ");
//		int n = sc.nextInt();
//		
//		if ( n % 2 == 0) {
//			System.out.println("Even number");
//		}else {
//			System.out.println("Odd number");
//		}

		// 5)Write a program to check whether a given year is leap year or not?\
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter year: ");
//		
//		
//		int year = sc.nextInt();
//		
//		if (year <= 0) {
//			System.out.println("Invalid year");
//		}else if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
//			System.out.println(year + " is Leap year");
//		}else {
//			System.out.println(year +" Not a leap year");
//		}

		// 6)Write a program to check whether a number is positive or negative?
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter number: ");
//		int n = sc.nextInt();
//		
//		if (n == 0) {
//			System.out.println("Please enter a valid number !!");
//		}else if (n > 0) {
//			System.out.println("Positive number");
//		}else {
//			System.out.println("Negative number");
//		}

		// 7)Write a program to find grade of a student based on marks?

//		Scanner sc  = new Scanner(System.in);
//		
//		System.out.print("Enter marks: ");
//		
//		int marks = sc.nextInt();
//		
//		
//		if (marks >= 90 && marks <= 100) {
//			System.err.println("A grade");
//		}else if (marks >= 75 && marks <= 89) {
//			System.out.println("B grade");
//		}else if (marks >= 50 && marks <= 74) {
//			System.out.println("C grade");
//		}else if (marks >= 35 && marks <= 49) {
//			System.out.println("D grade");
//		}else {
//			System.out.println("Fail");
//		}

		// 8)Write a program to print the day of the week based on the day number (1 -
		// 7)?

//		int day = 6;
//		
//		if (day <=0 || day > 7) {
//			System.out.println("Please enter a valid day ");
//		}else if (day == 1) {
//			System.out.println("Monday");
//		}else if (day == 2) {
//			System.out.println("Tuesday");
//		}else if (day == 3) {
//			System.out.println("Wednesday");
//		}else if (day == 4) {
//			System.out.println("Thursday");
//		}else if (day == 5) {
//			System.out.println("Friday");
//		}else if (day == 6) {
//			System.out.println("Saturday");
//		}else if (day == 7) {
//			System.out.println("Sunday");
//		}

		// 9)Write a program to check the type of triangle (Equilateral, Isoceles, or Scalene)
     		
     		
//     		int size1 = sc.nextInt();
//     		int size2 = sc.nextInt();
//     		int size3 = sc.nextInt();
//     		
//     		if (size1 == size2 && size2 == size3) {
//				System.out.println("Equilaterl triangle");
//			}else if (size1 == size2 && size2 != size3 || size2 == size3 && size3 != size1 || size1 == size3 && size3 != size2) {
//				System.out.println("Iscoceles triangle");
//			}else {
//				System.out.println("Scalene triangle");
//			}
     		
     		
     		//10)Write a program to print a message based in age group:
     		
//     		System.out.print("Enter age: ");
//     		int age = sc.nextInt();
//     		
//     		if (age < 0) {
//				System.out.println("Enter a valid age!!");
//			}else if (age >= 0 && age <= 12) {
//				System.out.println("Child");
//			}else if (age >= 13 && age <= 19) {
//				System.out.println("Teenager");
//			}else if (age >= 20 && age <= 59) {
//				System.out.println("Adult");
//			}else if (age >=60 ) {
//				System.out.println("Senior citizen");
//			}
     		
     		//11)Write a program to classify a temp as hot, warm, and cold?
     		
//     		int temp = sc.nextInt();
//     		
//     		if (temp >= 30) {
//				System.out.println("Hot");
//			}else if (temp >= 20 && temp <= 29) {
//				System.out.println("Warm");
//			}else {
//				System.out.println("Cold");
//			}
     		
     		//12)Write a program to check if a person is eligible for vote and if eligible , check if they can contest in election(age >= 25)
     		
//     		System.out.print("Enter age : ");
//     		int age = sc.nextInt();
//     		
//     		if (age >= 18) {
//				System.out.println("Eligible for vote!!");
//				
//				if (age >= 25) {
//					System.out.println("contest in election");
//				}else {
//					System.out.println("Not eligible for contest");
//				}
//			}else {
//				System.out.println("Not eligible");
//			}
     		
     		//13)Write a program to check if a year is a leap year and if leap, check if its a centuray year?
     		
//     		System.out.print("Enter year : ");
//     		int year = sc.nextInt();
//     		
//     		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
//				System.out.println("Leap year");
//				if (year % 100 == 0) {
//					System.out.println("Centuary year");
//				}
//			}else {
//				System.out.println("Not a leap year");
//			}
     		
     		//14)Write a program to check a number is even and if even .check whether it is greater then 50.
     		
     		
     		int n = sc.nextInt();
     		
     		if (n % 2 == 0) {
				System.out.println("Even number");
				
				if (n > 50) {
					System.out.println("The number is greater then 50!!");
				}
				
			}else {
				System.out.println("Odd number");
			}
     		
     		
     		
     		
     		
     		
     		
     		
     		

	}
}
