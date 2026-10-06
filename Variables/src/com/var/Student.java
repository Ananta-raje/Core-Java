package com.var;

public class Student {
	
	//Global/Instance variable

	static byte standard = 12;
	static short rollNumber = 25;
	static int studentId ;
	static long contactNumber = 9638293719L;

	static float percentage = 85.5f;
	static double attendence ;

	static char division = 'A';
	static boolean passed ;

	static String name = "Ananta";
	

	static int admissionYear = 2022;
	static double fees = 75000.50;
	static char grade = 'A';

	static boolean scholarship ;
	static String college = "ABC College"; //Initialized Predefined class
	
	static String myClg ; // predefined class has default value null

	public static void main(String[] args) {
		
//		static String myClg ; 
//		System.out.println(myClg);// This provide error because we must need to initialize local variable But in case of global var no need to initialize variable

		System.out.println(standard);
		System.out.println(rollNumber);
		System.out.println(studentId);
		System.out.println(contactNumber);
		System.out.println(percentage);
		System.out.println(attendence);
		System.out.println(division);
		System.out.println(passed);
		System.out.println(name);
		
		System.out.println(admissionYear);
		System.out.println(fees);
		System.out.println(grade);
		System.out.println(scholarship);
		System.out.println(college);
		System.out.println(myClg);
	}
}
