package com.loopstatements;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);


//Q1. Print numbers from 1 to 10.

//		int i = 1;
//
//		do {
//		    System.out.println(i);
//		    i++;
//		} while (i <= 10);


//Q2. Print numbers from 10 to 1 in reverse order.

//		int i = 10;
//
//		do {
//		    System.out.println(i);
//		    i--;
//		} while (i >= 1);


//Q3. Print all even numbers from 1 to 20.

//		int i = 2;
//
//		do {
//		    System.out.println(i);
//		    i += 2;
//		} while (i <= 20);


//Q4. Print all odd numbers from 1 to 20.

//		int i = 1;
//
//		do {
//		    System.out.println(i);
//		    i += 2;
//		} while (i <= 20);


//Q5. Calculate the sum of numbers from 1 to 10.

//		int i = 1;
//		int sum = 0;
//
//		do {
//		    sum = sum + i;
//		    i++;
//		} while (i <= 10);
//
//		System.out.println("Sum = " + sum);


//Q6. Print the multiplication table of 5.

//		int i = 1;
//
//		do {
//		    System.out.println("5 x " + i + " = " + (5 * i));
//		    i++;
//		} while (i <= 10);


//Q7. Calculate the factorial of a number.

//		int n = 5;
//		int i = 1;
//		int fact = 1;
//
//		do {
//		    fact = fact * i;
//		    i++;
//		} while (i <= n);
//
//		System.out.println("Factorial = " + fact);


//Q8. Calculate the power of a number without using Math.pow().

//		int base = 2;
//		int exponent = 5;
//		int result = 1;
//		int i = 1;
//
//		do {
//		    result = result * base;
//		    i++;
//		} while (i <= exponent);
//
//		System.out.println("Result = " + result);


//Q9. Count the number of digits in an integer.

//		int n = 12345;
//		int count = 0;
//
//		do {
//		    count++;
//		    n = n / 10;
//		} while (n != 0);
//
//		System.out.println("Digits = " + count);


//Q10. Calculate the sum of digits of a number.

//		int n = 1234;
//		int sum = 0;
//
//		do {
//		    int digit = n % 10;
//		    sum = sum + digit;
//		    n = n / 10;
//		} while (n != 0);
//
//		System.out.println("Sum = " + sum);


//Q11. Reverse a number.

//		int n = 1234;
//		int reverse = 0;
//
//		do {
//		    int digit = n % 10;
//		    reverse = reverse * 10 + digit;
//		    n = n / 10;
//		} while (n != 0);
//
//		System.out.println("Reverse = " + reverse);


//Q12. Check whether a number is a palindrome.

//		int n = 121;
//		int original = n;
//		int reverse = 0;
//
//		do {
//		    int digit = n % 10;
//		    reverse = reverse * 10 + digit;
//		    n = n / 10;
//		} while (n != 0);
//
//		if (original == reverse) {
//		    System.out.println("Palindrome");
//		} else {
//		    System.out.println("Not a palindrome");
//		}


//Q13. Check whether a number is prime.

//		int n = 17;
//		int i = 2;
//		boolean isPrime = true;
//
//		if (n <= 1) {
//		    isPrime = false;
//		} else {
//		    do {
//		        if (n % i == 0) {
//		            isPrime = false;
//		            break;
//		        }
//		        i++;
//		    } while (i <= n / i);
//		}
//
//		if (isPrime) {
//		    System.out.println("Prime number");
//		} else {
//		    System.out.println("Not a prime number");
//		}


//Q14. Check whether a number is an Armstrong number.

//		int n = 153;
//		int original = n;
//		int temp = n;
//		int digits = 0;
//		int sum = 0;
//
//		do {
//		    digits++;
//		    temp = temp / 10;
//		} while (temp != 0);
//
//		temp = n;
//
//		do {
//		    int digit = temp % 10;
//		    sum += (int) Math.pow(digit, digits);
//		    temp = temp / 10;
//		} while (temp != 0);
//
//		if (sum == original) {
//		    System.out.println("Armstrong number");
//		} else {
//		    System.out.println("Not an Armstrong number");
//		}


//Q15. Find the largest digit in a number.

//		int n = 58321;
//		int max = 0;
//
//		do {
//		    int digit = n % 10;
//
//		    if (digit > max) {
//		        max = digit;
//		    }
//
//		    n = n / 10;
//		} while (n != 0);
//
//		System.out.println("Largest digit = " + max);


//Q16. Find the smallest digit in a number.

//		int n = 58321;
//		int min = 9;
//
//		do {
//		    int digit = n % 10;
//
//		    if (digit < min) {
//		        min = digit;
//		    }
//
//		    n = n / 10;
//		} while (n != 0);
//
//		System.out.println("Smallest digit = " + min);


//Q17. Print the Fibonacci series.

//		int n = 10;
//		int a = 0;
//		int b = 1;
//		int count = 0;
//
//		do {
//		    System.out.print(a + " ");
//
//		    int next = a + b;
//		    a = b;
//		    b = next;
//
//		    count++;
//		} while (count < n);


//Q18. Find the GCD of two numbers.

//		int a = 24;
//		int b = 36;
//
//		do {
//		    int remainder = a % b;
//		    a = b;
//		    b = remainder;
//		} while (b != 0);
//
//		System.out.println("GCD = " + a);


//Q19. Find the LCM of two numbers.

//		int a = 12;
//		int b = 18;
//
//		int x = a;
//		int y = b;
//
//		do {
//		    int remainder = x % y;
//		    x = y;
//		    y = remainder;
//		} while (y != 0);
//
//		int gcd = x;
//		int lcm = (a / gcd) * b;
//
//		System.out.println("LCM = " + lcm);


//Q20. Check whether a number is a perfect number.

//		int n = 28;
//		int i = 1;
//		int sum = 0;
//
//		do {
//		    if (n % i == 0) {
//		        sum += i;
//		    }
//		    i++;
//		} while (i <= n / 2);
//
//		if (n > 1 && sum == n) {
//		    System.out.println("Perfect number");
//		} else {
//		    System.out.println("Not a perfect number");
//		}


//Q21. Count the even and odd digits in a number.

//		int n = 123456;
//		int evenCount = 0;
//		int oddCount = 0;
//
//		do {
//		    int digit = n % 10;
//
//		    if (digit % 2 == 0) {
//		        evenCount++;
//		    } else {
//		        oddCount++;
//		    }
//
//		    n = n / 10;
//		} while (n != 0);
//
//		System.out.println("Even digits = " + evenCount);
//		System.out.println("Odd digits = " + oddCount);


//Q22. Calculate the sum of even and odd digits separately.

//		int n = 123456;
//		int evenSum = 0;
//		int oddSum = 0;
//
//		do {
//		    int digit = n % 10;
//
//		    if (digit % 2 == 0) {
//		        evenSum += digit;
//		    } else {
//		        oddSum += digit;
//		    }
//
//		    n = n / 10;
//		} while (n != 0);
//
//		System.out.println("Sum of even digits = " + evenSum);
//		System.out.println("Sum of odd digits = " + oddSum);


//Q23. Check whether a number is a Strong number.

//		int n = 145;
//		int original = n;
//		int sum = 0;
//
//		do {
//		    int digit = n % 10;
//		    int fact = 1;
//		    int i = 1;
//
//		    do {
//		        fact = fact * i;
//		        i++;
//		    } while (i <= digit);
//
//		    sum += fact;
//		    n = n / 10;
//		} while (n != 0);
//
//		if (sum == original) {
//		    System.out.println("Strong number");
//		} else {
//		    System.out.println("Not a Strong number");
//		}


//Q24. Print the following number pattern using do-while loops.
//
//		1
//		12
//		123
//		1234
//		12345

//		int i = 1;
//
//		do {
//		    int j = 1;
//
//		    do {
//		        System.out.print(j);
//		        j++;
//		    } while (j <= i);
//
//		    System.out.println();
//		    i++;
//		} while (i <= 5);


//Q25. Create a number-guessing game using a do-while loop.

//
//		int secretNumber = 7;
//		int guess;
//
//		do {
//		    System.out.print("Guess the number (1-10): ");
//		    guess = sc.nextInt();
//
//		    if (guess < secretNumber) {
//		        System.out.println("Too low! Try again.");
//		    } else if (guess > secretNumber) {
//		        System.out.println("Too high! Try again.");
//		    } else {
//		        System.out.println("Congratulations! Correct guess.");
//		    }
//
//		} while (guess != secretNumber);
//
//		

	}

}