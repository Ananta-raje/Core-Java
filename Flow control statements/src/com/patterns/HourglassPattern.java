package com.patterns;

public class HourglassPattern {
	public static void main(String[] args) {

		for(int i = 5; i >= 1; i--) {
			if (i % 2 != 0) {
				
				for(int j = 5; j >= i ; j--) {
					System.out.print(" ");
				}
				for(int j = 1; j <= i; j++) {
					System.out.print("*" + " ");
				}
			}
			System.out.println();
		}
		for(int i = 1; i <= 5; i++) {
			if (i % 2 != 0) {
				
				for(int j = 5; j >= i ; j--) {
					System.out.print(" ");
				}
				for(int j = 1; j <= i; j++) {
					System.out.print("*" + " ");
				}
			}
			System.out.println();
		}
	}
}
