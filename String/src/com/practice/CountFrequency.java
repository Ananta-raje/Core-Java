package com.practice;

public class CountFrequency {

	// Write a Java program to count the frequency of each character in a given
	// String.

	public static void main(String[] args) {
		String str = "	programming";

		int p = 0;
		int r = 0;
		int o = 0;
		int g = 0;
		int a = 0;
		int m = 0;
		int i = 0;
		int n = 0;

		for (int k = 0; k < str.length(); k++) {
			char ch = str.charAt(k);

			if (ch == 'p') {
				p++;
			} else if (ch == 'r') {
				r++;
			} else if (ch == 'o') {
				o++;
			} else if (ch == 'g') {
				g++;
			} else if (ch == 'a') {
				a++;
			} else if (ch == 'm') {
				m++;
			} else if (ch == 'i') {
				i++;
			} else if (ch == 'n') {
				n++;
			} else {
				System.out.println("Not a valid character");
			}
		}

		System.out.println("p = " + p);
		System.out.println("r = " + r);
		System.out.println("o = " + o);
		System.out.println("g = " + g);
		System.out.println("a = " + a);
		System.out.println("m = " + m);
		System.out.println("i = " + i);
		System.out.println("n = " + n);
	}
}
