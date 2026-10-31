package com.practice;

public class CountVowelsAndCons {
	
	
//Write a Java program to count the total number of vowels and consonants in a given String.
	public static void main(String[] args) {
		String str = "Hello world";

		str = str.toLowerCase();
		int vowels = 0;
		int cons = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					cons++;
				}
			}

		}

		System.out.println("Total vowels: " + vowels);
		System.out.println("Total consonants: " + cons);

	}
}
