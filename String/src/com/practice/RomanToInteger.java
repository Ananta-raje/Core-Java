package com.practice;

import java.util.HashMap;

public class RomanToInteger {

	public static int romanToInt(String s) {
		int val = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		for (int i = 0; i < s.length() - 1; i++) {
			char prevCh = s.charAt(i);
			char nextCh = s.charAt(i + 1);

			if (map.get(prevCh) < map.get(nextCh)) {
				val -= map.get(prevCh);
			}else {
				val += map.get(nextCh);
			}
		}
		
		return val + map.get(s.charAt(s.length() - 1));
	}

	public static void main(String[] args) {
		String roman = "X";

		System.out.println(romanToInt(roman));
	}
}
