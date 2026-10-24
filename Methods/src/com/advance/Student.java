package com.advance;

public class Student {
	private String name;
	private int rollNumber;
    private int marks;
    
    
    public void setDetails(String n, int r, int m) {
    	name = n;
    	rollNumber = r;
    	marks = m;
    }
    
    public void displayDetails() {
    	System.out.println("Student name : "+ name);
    	System.out.println("Student rollNumber : "+ rollNumber);
    	System.out.println("Student marks : "+ marks);
    	System.out.println("Student grade is: " + getGrade());
    	if (isPassed()) {
			System.out.println("Overall result: Pass");
		}else {
			System.out.println("Overall result: Fail");
		}

    }
    
    
    public char getGrade() {
    	if (marks < 0 || marks > 100) {
			return'I';
		}else if (marks >= 90) {
			return'A';
		}else if (marks >= 75) {
			return'B';
		}else if (marks >= 50) {
			return'C';
		}else if (marks >= 35) {
			return'D';
		}else {
			return'F';
		}
    }
    
    public boolean isPassed() {
    	if (marks >= 35 && marks <= 100) {
			return true;
		}
    	return false;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
