package com.practice;

public class Demo {

	// 1
	public int addTwo(int a, int b) {
		int c = a + b;
		return c;
	}

	// 2
	public void printInfo(String name) {
		System.out.println(name);
		System.out.println("Welcome to Java Programing!!");
	}

	// 3
	public int age() {
		return 23;
	}

	// 4
	public void info() {
		System.out.println("Welcome to Java!  ");
		System.out.println("Lets learn methods");
	}

	// 5
	public int square(int a) {
		return a * a;
	}

	// 6
	public boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}

	// 7
	public void stuInfo(String name, int age, double marks) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("marks: " + marks);

	}

	// 8
	public int num() {
		return 100;
	}

	// 9
	public int greaterNo(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}

	// 10
	public void printNo() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}

	// 11
	public double simpleInterest(int p, int r, int t) {
		int si = (p * r * t) / 100;
		return si;
	}

	// 12
	public boolean vote(int age) {
		if (age >= 18) {
			return true;
		}
		return false;
	}

	// 13
	public int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	// 14
	Employee e1 = new Employee();

	public void empInfo() {
		System.out.println("Employee name: " + e1.empName);
		System.out.println("Employee salary: " + e1.salary);
	}

	// 15
	public int getLength(String s) {
		int len = s.length();
		return len;
	}

	// 16
	public double convertToFahrenheit(double cel) {
		double f = (cel * 9 / 5) + 32;

		return f;
	}

	// 17
	public void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}

	// 18
	public String checkNo(int n) {
		if (n > 0) {
			return "Positive";
		} else if (n < 0) {
			return " Negative ";
		} else {
			return "Zero";
		}
	}

	// 19
	public double avg(int a, int b, int c) {
		double avg = (a + b + c) / 3;
		return avg;

	}

	// 20
	public int greatestOfThree(int a, int b, int c) {
		if (a > b && b > c) {
			return a;
		} else if (b > c) {
			return b;
		}
		return c;

	}

	// 25
	public boolean isPalindrome(int n) {

		int original = n;
		int reversed = 0;

		while (n > 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n = n / 10;
		}
		if (original == reversed) {
			return true;
		} else {
			return false;
		}

	}

	// 26
	public int countDigit(int n) {
		int count = 0;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			count++;
		}
		return count;
	}

	// 27
//	| Units consumed  | Rate per unit |
//	| --------------- | ------------: |
//	| First 100 units |            ₹2 |
//	| Next 100 units  |            ₹3 |
//	| Above 200 units |            ₹5 |

	public int billCalcutor(int units) {
		int bill = 0;

		if (units <= 100) {
			bill = units * 2;
		} else if (units <= 200) {
			bill = (100 * 2) + ((units - 100) * 3);
		} else {
			bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);

		}
		return bill;
	}

}
