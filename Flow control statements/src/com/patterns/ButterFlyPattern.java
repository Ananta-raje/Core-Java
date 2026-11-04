package com.patterns;

public class ButterFlyPattern {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			if (i % 2 != 0) {

				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}

				for (int k = 1; k <= 2 * (5 - i); k++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}

				System.out.println();
			}
		}

		
		for (int i = 3; i >= 1; i--) {

			if (i % 2 != 0) {

				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}

				for (int k = 1; k <= 2 * (5 - i); k++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}

				System.out.println();
			}
		}

	}
}
