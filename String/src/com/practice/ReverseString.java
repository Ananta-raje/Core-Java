package com.practice;

public class ReverseString {

//Write a Java program to reverse a given String with using the predefined reverse() method.

//	public static String reverseStr(String str) {
//		StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < str.length(); i++) {
//			sb.append(str.charAt(i));
//		}
//
//		return sb.reverse().toString();
//	}
//
//	public static void main(String[] args) {
//
//		String str = "Java Programming";
//		System.out.println(reverseStr(str));
//
//	}
	
	
//Write a Java program to reverse a given String without using the predefined reverse() method.

	public static String reverseStr(String str) {
		
		StringBuilder sb = new StringBuilder();

		for(int i = str.length() - 1; i >= 0 ; i--) {
			char ch = str.charAt(i);
			sb.append(ch);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String str = "Java Programming";
		System.out.println(reverseStr(str));
	}
}
