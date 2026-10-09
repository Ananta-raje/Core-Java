package com.operators;

public class LogicalOperators {

	public static void main(String[] args) {

//		// && operators
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		
		//Short circuit in && 
		// If first condition is false
//		int a = 10;
//		System.out.println(false && ++a > 10);//short-circuit evaluation --> If first condition is false the && operator does not evaluate the second condition
//		System.out.println(a);//10
//		System.out.println(false && ++a > 10 && a++ < 20 && a == 11);//false
//		System.out.println(a);//10
		
		// If false occurs at the middle
//		int a = 10;
//		System.out.println(true && ++a > 10 && a++ < 12 && a == 12);//true
//		System.out.println(a);//12
//		System.out.println(true && ++a > 10 && ++a < 12 && a == 12);
//		System.out.println(a);//14
		
		
		
	
//		System.out.println(" ");
//
//		// OR operators
//		System.out.println(true || true);
//		System.out.println(true || false);
//		System.out.println(false || true);
//		System.out.println(false || false);
		
//		int a = 10;
//		System.out.println(true || ++a > 10);//short-circuit evaluation --> If first condition is true in  the || operator does not evaluate the second condition
//		System.out.println(a);//10
		
		// If true occurs at the middle
//		int a = 10;
//		System.out.println(true || ++a > 10 || a++ < 12 || a == 12);//true
//		System.out.println(a);//10
//		System.out.println(true || ++a > 10 || ++a < 12 || a == 12);//true
//		System.out.println(a);//

//		int a = 10;
//		System.out.println(false || ++a > 10 || a++ < 12 || a == 12);//true
//		System.out.println(a);//11
//		System.out.println(false || a++ > 10 || ++a < 12 || a == 12);//true
//		System.out.println(a);//12  
		
		
		
		//(not)! operator
		
		//System.out.println(!(true));
//		int a = 5;
//		System.out.println(!a);//Error --> because not(!) operator does not work directly with integer values   
		
		
//		//Combine All Logical operators
//		 //1
//		boolean check = 4 <= 6;
//		
//		System.out.println(check || false && 4 > 4 || !("Ram" == "ram"));
//		
//		//2
//		boolean a = 10 > 5;
//		boolean b = 20 < 10;
//
//		System.out.println(a && b || !a && true);
//		
//		//3
//		boolean x = true;
//
//		System.out.println(!x || x && false || !false);
//		
//		//4
//		int a = 10;
//		int b = 20;
//
//		System.out.println(a < b && b > 15 || a > 20 && !false);
//		
//		//5
//		boolean a = false;
//		boolean b = true;
//
//		System.out.println(!a && b || a && !b);
//		
//		//6
//		int x = 5;
//
//		System.out.println(x++ > 5 || ++x > 6 && x == 7);
//		
//		//7
//		int a = 10;
//
//		System.out.println(a > 5 || a++ > 20 && ++a > 10);
//		System.out.println(a);
//		
//		//8
//		boolean a = true;
//		boolean b = false;
//		boolean c = true;
//
//		System.out.println(a && !b || c && !a || !c);
//		
//		//9 
//		int x = 10;
//		int y = 20;
//
//		System.out.println(x++ == 10 && ++y == 21 || x == 11 && y > 20);
//		
//		//10
//		boolean result = 5 > 3 && 10 < 5 || !(20 == 20) && true;
//
//		System.out.println(result);
//		
//		
//		//11
//		int a = 5;
//		int b = 10;
//
//		System.out.println(a > 3 && b++ > 10 || ++a == 6 && b == 11);
//		System.out.println(a + " " + b);
//		
//		
//		//12
//		boolean x = false;
//
//		System.out.println(x && (10 / 0 > 1) || true);
//		
//		//13
//		boolean x = true;
//
//		System.out.println(x || (10 / 0 > 1) && false);
//		
//		//14
//		int a = 10;
//
//		System.out.println(a > 5 && a++ > 20 || a++ == 11);
//		System.out.println(a);
//		
//		//15
//		boolean a = true;
//		boolean b = false;
//
//		System.out.println(!(a && b) || a && !b);
//		
//		
//		//16
//		int x = 5;
//
//		System.out.println(x > 2 && x < 10 || x == 5 && !false);
//		
//		//17
//		boolean a = false;
//		boolean b = true;
//		boolean c = false;
//
//		System.out.println(a || b && !c || !b && c);
//		
//		//18
//		
//		int x = 5;
//
//		System.out.println(x++ > 5 && ++x > 6 || x++ == 6);
//		System.out.println(x);
//		
//		
//		//19
//		String s1 = "Java";
//		String s2 = "Java";
//
//		System.out.println(s1 == s2 && s1.equals(s2) || !s1.equals("java"));
//		
//		//20
//		int a = 5;
//		boolean b = true;
//
//		System.out.println(
//		    a++ > 5 && ++a > 6
//		    || b && a++ == 6
//		    && !false
//		    || a > 7
//		);
//
//		System.out.println(a);
		
		

		
	}
}
