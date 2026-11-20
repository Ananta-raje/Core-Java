package com.unboxing;

public class Main {
	public static void main(String[] args) {
		Integer a = 100;
		int b = a;// Wrapper Object → Primitive = Unboxing. int b = a.intValue();

		System.out.println(b);
		
        try {
        	Integer num = null;

            int i = num;

            System.out.println(i);//NullPointerexception
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
