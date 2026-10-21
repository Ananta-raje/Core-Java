package com.practice;

public class PracticeSession {

	public static void main(String[] args) {

		// 1)Print square pattern
//		for(int i = 1; i <= 4; i++) {
//			for(int j = 4; j >= 1;j-- ) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 2)print right angle triangle

//		for(int  i = 1; i <= 4; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 3)Print numbers from 1 to 5 in each row using nested loops

//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 5; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

		// 4)print a pattern where even rows print * and odd rows print #

//		for(int i = 1; i <= 6; i++) {
//			for(int j = 1; j <= i; j++) {
//				if (i % 2 == 0) {
//					System.out.print("*");
//				}else {
//					
//					System.out.print("#");
//				}
//			}
//			System.out.println();
//			
//		}

		// 5)Print a pattern of numbers where:

//		1
//		22
//		333
//		4444

//	  for(int  i = 1; i <= 4; i++) {
//		  for(int j = 1; j <= i ; j++) {
//			  System.out.print(i);
//		  }
//		  System.out.println();
//	  }

		// 6)Print a multiplication table from 1 to 5 using nested loops.
//		for(int i = 1 ; i <= 5; i++) {
//			for(int j = 1; j <= 10; j++) {
//				System.out.print( i * j + " ");
//			}
//			System.out.println();
//		}

		// 7)Print the even numbers from 1 to 50

//		int count = 0;
//		
//		for(int i = 1; i <= 50; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		System.out.println();
//		System.out.println("Total even no  from 1 to 50 are: " + count);

		// 8)Print a pattern where:

//			1 0 1
//			0 1 0
//			1 0 1

//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 3; j++) {
//				if (i % 2 != 0) {
//					if (j % 2 == 0) {
//						System.out.print(0 + " ");
//					} else {
//						System.out.print(1 + " ");
//					}
//				} else {
//					if (j % 2 == 0) {
//						System.out.print(1 + " ");
//					} else {
//						System.out.print(0 + " ");
//					}
//				}
//			}
//			System.out.println();
//		}

		// 9)Print a pyramid pattern:

//		    *
//		   ***
//		  *****
//		 *******

//		for( int i = 1 ; i <= 4; i++) {
//			
//			for( int j = 1; j <= (4 - i); j++) {
//				System.out.print(" ");
//			}
//			
//			for(int k = 1; k <= (2 * i - 1); k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//	}

		// 10)Print a pattern where prime numbers are printed in a matrix (e.g., 5x5),
		// and non-prime numbers are replaced with X.

		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= 25; j++) {

				boolean isPrime = true;

				if (j <= 1) {
					isPrime = false;
				} else {
					for (int k = 2; k < j; k++) {
						if (j % k == 0) {
							isPrime = false;
							break;
						}
					}
				}

				if (isPrime) {
					System.out.print(j + " ");
				} else {
					System.out.print("X ");
				}

				if (j % 5 == 0) {
					System.out.println();
				}
			}
 		}
	}
}
