package com.learn;

public class MainClass {
	public static void main(String[] args) {
		
//		•	String is a class, not a primitive data type. 
//		•	Strings are objects in Java. 
//		•	The String class belongs to the java.lang package. 
//		•	String objects are immutable. 
//		•	String literals can be stored in the String Constant Pool. 
//
//		String name = " Ananta ";
//		String city = " pune ";
//		
//		System.out.println(name);
//		System.out.println(city);
		
		
		//Q.How many ways can you create a String in Java?
		//1.Using String literal
		//String s1 = "Java";//The JVM uses the String Constant Pool to reuse eligible, identical string literals.
		
		//2. Using the new keyword
		//String s2 = new String("Java");
		//This explicitly creates a new String object on the heap, assuming normal successful execution.
		
		

		//System.out.println(s1 == s2);//  == compares object references when used with reference variables. 

		//System.out.println(s1.equals(s2));// equals() compares String contents. 
		
		
		//Difference between String and char
//		String name = "Java";
//		char letter = 'J';
//		int i = letter;
//
//		System.out.println(name);
//		System.out.println(letter);
//		System.out.println(i);
		
		
		//Q.Why String is a class in java?
		//String is a class because Java provides methods and behavior for working with sequences of characters.
		
//		String  s = "Java Programing";
//		
//		System.out.println(s.length());
//		System.out.println(s.toUpperCase());
//		System.out.println(s.substring(5));
		
		//Difference between empty string and null string
//		String s1 = "";
//		String s2 = null;
//		
//		System.out.println(s1.length());
//		try {
//			System.out.println(s2.length());// java.lang.NullPointerException
//		} catch (Exception e) {
//			System.out.println("NUllPointerException ");
//		}
//		System.out.println(s2 == null);
		

//LEVEL 2: String Immutability
		//Immutability means that an object's state cannot be changed after the object has been created
		//String methods that appear to modify a String return a new String when a change is necessary.
		
//		String s = "Java";
//		s.concat("Programing");
//		
//		System.out.println(s);//Java
		
		
//		String s = "Java";
//		s = s.concat(" Programing");
//		
//		System.out.println(s);//Java Programing
		
		
		//The String objects are immutable, but the reference variable s can be reassigned.
//		String s = "Java";
//		s = "Python";
//		
//		System.out.println(s);
		
//		final String s = "Java";//You cannot reassign s to another String because the reference variable is final.
//		
//		s = "Pyhton";//error
//		System.out.println(s);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
