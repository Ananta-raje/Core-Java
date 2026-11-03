package com.practice;

public class Demo {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getId());
	
	Thread t1 = new Thread(() -> {
		System.out.println(Thread.currentThread().getName());//lambda expresion
		System.out.println(Thread.currentThread().getId());

	});
	t1.start();
	
	Thread t2 = new Thread(() -> {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());

	});
	t2.start();

	
	
}
	

}
