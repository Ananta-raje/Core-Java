package com.tka.practice;

public class X {
	int x = 10;
}

class Y extends X{
	int y = 20;
}

class Z extends Y{
	int z = 30;

	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
