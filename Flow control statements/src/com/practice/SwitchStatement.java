package com.practice;

import java.security.KeyStore.PasswordProtection;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1)Write a program to print the day name using a number.

//		int day = 4;
//		
//		switch (day) {
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//
//		default:
//			System.out.println("Invalid day!!");
//			break;
//		}

		// 2)Write a program to print month name based on number (1–12).

//		int monthsNo = 3;
//		
//		switch (monthsNo) {
//		case 1:
//			System.out.println("Janauray");
//			break;
//		case 2:
//			System.out.println("february");
//			break;
//		case 3:
//			System.out.println("March");
//			break;
//		case 4:
//			System.out.println("April");
//			break;
//		case 5:
//			System.out.println("May");
//			break;
//		case 6:
//			System.out.println("June");
//			break;
//		case 7:
//			System.out.println("July");
//			break;
//		case 8:
//			System.out.println("Augest");
//			break;
//		case 9:
//			System.out.println("September");
//			break;
//		case 10:
//			System.out.println("Automber");
//			break;
//		case 11:
//			System.out.println("November");
//			break;
//		case 12:
//			System.out.println("December");
//			break;
//		default:
//			System.out.println("Invalid months number!!");
//			break;
//		}

		// 3)Create a calculator using switch case for operations:

//		int a = 10;
//		int b = 15;
//		char operand = '-';
//		
//		switch (operand) {
//		case '+':
//			System.out.println(a + b);
//			break;
//		case '-':
//			System.out.println(a - b);
//			break;
//		case '/':
//			System.out.println(a / b);
//			break;
//		case '%':
//			System.out.println(a % b);
//			break;
//		default:
//			System.out.println("Invalid input!!");
//			break;
//		}

		// 4)Write a program to check whether a character is a vowel or consonant using
		// switch.

//		char ch = 'h';
//		
//		switch (ch) {
//		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
//			System.out.println("Vowels --> "+ ch);
//			break;
//
//		default:
//			System.out.println("Consonent --> " + ch);
//			break;
//		}

		// 5)Write a program to print grade description.

//		char ch = 'C';
//		 
//		switch (ch) {
//		case 'A': {
//			System.out.println("Excellent");
//			break;
//		}
//		case 'B': {
//			System.out.println("Excellent");
//			break;
//		}
//		case 'C': {
//			System.out.println("Excellent");
//			break;
//		}
//		case 'D': {
//			System.out.println("Excellent");
//			break;
//		}case 'F': {
//			System.out.println("Fail");
//			break;
//		}
//		default:
//			System.out.println("Invalid input");
//		}

		// 6)Write a program to check even or odd using switch case.

//		int num = 5;
//		
//		switch (num % 2) {
//		case 0:
//			System.out.println("Even");
//			break;
//
//		default:
//			System.out.println("Odd");
//			break;
//		}

		// 7)Menu Driven Program

//		int num = 3;
//		
//		switch (num) {
//		case 1:
//			System.out.println("Login");
//			break;
//		case 2:
//			System.out.println("Register");
//			break;
//		case 3:
//			System.out.println("Profile");
//			break;
//		case 4:
//			System.out.println("Logout");
//			break;
//		default:
//			System.out.println("Enter a valid number!!");
//			break;
//		}

		// 8)Check if the day is Weekend or Weekday.

//		String day = "Monday";
//		
//		switch (day) {
//		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
//			System.out.println("Weekday");
//			break;
//			
//		case "Saturday", "Sunday" :
//			System.out.println("Weekend");
//			break;
//		default:
//			System.out.println("Invalid day");
//			break;
//		}

		// 9)Write a program using switch where operator is: + - * /

		// 10)Calculate area using switch.
//		System.out.print("Enter input: ");
//		int input = sc.nextInt() ;
//		
//		switch (input) {
//		case 1:
//			System.out.print("Enter a radius : ");
//			double rad = sc.nextDouble();
//			double areaC = Math.PI * rad * rad;
//			System.out.println("The area of circle is: " + areaC );
//			break;
//		case 2:
//			System.out.print("Enter Length : ");
//			int length = sc.nextInt();
//			System.out.print("Enter Width : ");
//			int width = sc.nextInt();
//			int areaR = length * width;
//			System.out.println("The area of rectangle is: " + areaR );
//			break;
//		case 3:
//			System.out.print("Enter side: ");
//			int side = sc.nextInt();
//			int areaS = side * side;
//			System.out.println("The area of square is: " + areaS );
//			break;
//		default:
//			System.out.println("Enter a valid input");
//			break;
//		}

		// 11)Input language code and print name.
//		System.out.print("Enter Input : ");
//		int i = sc.nextInt();
//		
//		switch (i) {
//		case 1:
//			System.out.println("Java");
//			break;
//		case 2:
//			System.out.println("Python");
//			break;
//		case 3:
//			System.out.println("C++");
//			break;
//		case 4:
//			System.out.println("JavaScript");
//			break;
//
//		default:
//			System.out.println("Enter valid input !!");
//			break;
//		}

		// 12)Print traffic signal message.

//		String clr = "red";
//
//		switch (clr) {
//		case "red":
//			System.out.println("Stop");
//			break;
//		case "Yellow":
//			System.out.println("Ready");
//			break;
//		case "Green":
//			System.out.println("Go");
//			break;
//
//		default:
//			System.out.println("GO Anywhere!!");
//			break;
//		}
		
		//13)Print department name.

//		int num = 4;
//		
//		switch (num) {
//		case 1:
//			System.out.println("CS");
//			break;
//		case 2:
//			System.out.println("ME");
//			break;
//		case 3:
//			System.out.println("Civil");
//			break;
//		case 4:
//			System.out.println("Electrical");
//			break;
//
//		default:
//			System.out.println("Enter valid deptNo: ");
//			break;
//		}
		
		//14)Print season based on month number.
	    
//		int monNo = 10;
//		
//		switch (monNo) {
//		case 11,12, 1, 2:
//			System.out.println("Winter");
//			break;
//		case 3, 4, 5, 6:
//			System.out.println("Summer");
//			break;
//		case  7, 8, 9, 10:
//			System.out.println("Monsoon");
//			break;
//
//		default:
//			System.out.println("Enter valid Month number: ");
//			break;
//		}
		
		
		//15)Create a mobile settings menu.
		
//		int number = 1;
//		
//		switch (number) {
//		case 1:
//			System.out.println("WI-FI");
//			break;
//		case 2:
//			System.out.println("Bluetooth");
//			break;
//		case 3:
//			System.out.println("Mobile data");
//			break;
//		case 4:
//			System.out.println("Airplane mode");
//			break;
//
//		default:
//			System.out.println("Enter valid no!!");
//			break;
//		}
		
		//16)Check character type.
//		System.out.print("Enter character: ");
//		
//		char ch = sc.next().charAt(0);
//		
//		switch (Character.getType(ch)) {
//		case Character.UPPERCASE_LETTER:
//			System.out.println("Uppercase letter ");
//			break;
//		case Character.LOWERCASE_LETTER:
//			System.out.println("Lowercase letter ");
//			break;
//		case Character.DECIMAL_DIGIT_NUMBER:
//			System.out.println(" Digit ");
//			break;
//
//		default:
//			System.out.println("Special character or symbol !!");
//			break;
//		}
		
		
		//17)Create food menu.
		
//		System.out.println("--> Food menu <--");
//		
//		System.out.println("1.Pizza");
//		System.out.println("2.Burger");
//		System.out.println("3.Sandwitch");
//		System.out.println("4.Pasta");
//		
//		System.out.print("Enter your choice menu:  ");
//		int menu = sc.nextInt();
//		
//		
//		switch (menu) {
//		case 1:
//			System.out.println("Pizza");
//			break;
//		case 2:
//			System.out.println("Burger");
//			break;
//		case 3:
//			System.out.println("Sandwitch");
//			break;
//		case 4:
//			System.out.println("Pasta");
//			break;
//
//		default:
//			System.out.print("Enter valid menu choice:  ");
//			break;
//		}
		
		//18)ATM Menu Program
		System.out.println(" Select an option: ");
		System.out.println("1--> Check balance");
		System.out.println("2--> Withdrawal");
		System.out.println("3--> Deposite");
		System.out.println("4--> Exit");
		
		System.out.print("Enter an option: ");
		int option = sc.nextInt();
		int balance = 10000;
		int withBalance = 0;
		
		
		
		switch (option) {
		case 1:
			System.out.print("Enter Pin to check balance:");
			int pin = sc.nextInt();
			if (pin == 1234) {
				System.out.println("Account Balance is: " + balance);
			}
			
			break;
		case 2:
			System.out.print("Enter Pin to withdrawal balance:");
			pin = sc.nextInt();
			if (pin == 1234) {
				System.out.print("Enter amount to withdraw: ");
			    withBalance = sc.nextInt();
				System.out.println("WithBalance is: " + withBalance);
				balance = balance - withBalance;
				System.out.println("Account balance is: " + balance);
			}
			break;
		case 3:
			System.out.println("Enter pin to deposit : ");
			pin = sc.nextInt();
			System.out.print("Enter deposit amount: ");
			int deposite = sc.nextInt();
			balance = balance + deposite;
			System.out.println("Account balance is : "+ balance);
			break;
		case 4:
			System.out.println("Exit");
			break;

		default:
			System.out.println("Invalid option");
			break;
		}
		

		
		

	}

}
