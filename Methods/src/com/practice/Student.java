package com.practice;

public class Student {

	int stuId;
	String stuName;
	
	int marks;
	
	
	public char result(int marks) {
		if (marks >= 90 && marks <= 100 ) {
			return'A';
		}else if (marks >= 75 && marks <= 89) {
			return'B';
		}else if (marks >= 60 && marks <= 74) {
			return'C';
		}else if (marks >= 35 && marks <= 59) {
			return'D';
		}else {
			return'F';
		}
	}
}
