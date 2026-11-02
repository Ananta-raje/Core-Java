package com.practice;

public class ValidPalindromeLeetcode {

	public static boolean checkPalindrome(String result) {
		int left = 0;
		int right = result.length() - 1;

		while (left < right) {
			if (result.charAt(left) != result.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;

	}

	public static boolean validPalindrome(String s) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch) || Character.isDigit(ch)) {
				sb.append(ch);
			}
		}

		String result = sb.toString();
		
		result = result.toLowerCase();

		if (checkPalindrome(result)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
//		String s = "A man, a plan, a canal: Panama";
		String s = "race a car";
		System.out.println(validPalindrome(s));
	}
}
