package com.test;

public class Student1 {
	private String name;
	private int marks;
	
	
	public Student1() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public char getGrade() {
		if (marks >=  90 && marks <= 100) {
			return 'A';
		}else if (marks >= 75) {
			return'B';
		}else if (marks >= 35) {
			return'C';
		}else {
			return'F';
		}
	}
	
	public void printDetails() {
		System.out.println("Student name: "+ name);
		System.out.println("Student marks: "+ marks);
		System.out.println("student grade: " + getGrade());
	}
	

}
