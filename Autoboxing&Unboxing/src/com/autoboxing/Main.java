package com.autoboxing;

public class Main {
	public static void main(String[] args) {
     int a = 10;
     Integer  obj = a;//Primitive → Wrapper Object = Auto boxing. Java automatically calls Integer.valueOf().
//     Integer obj = Integer.valueOf(a);
     System.out.println(obj);
	}
}
