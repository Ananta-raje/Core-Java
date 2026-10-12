package com.practice;

public class Test3 {
public static void main(String[] args) {
	
//	127 पेक्षा जास्त	256 वजा करायचे	130 - 256 = -126
//	-128 पेक्षा कमी	256 मिळवायचे	-252 + 256 = 4
	byte a = 100;
	a+=30;
	a*= 2;
	
	// byte b = 260;//compilation error--> -128 t0 127 store byte
    byte b = (byte) 260;
	byte c = (byte)b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
}
