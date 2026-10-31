package com.practice;

public class CheckPalindrome {
	
//Write a Java program to check whether a given String is a palindrome.
	public static boolean isPalindrome(String str) {
		
		StringBuilder sb = new StringBuilder();
		str = str.toLowerCase();
		
		for(int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		if (str.equals(sb.toString())) {
			return true;
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		String str = "Madam";
		System.out.println(isPalindrome(str));
	}
}
