package com.practice;

public class ClassLevelCustomLock {
	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			Counter1.increment();
		});

		Thread t2 = new Thread(() -> {
			Counter1.increment();
		});

		t1.start();
		t2.start();
	}
}

class Counter1 {
	static int count;

	static void increment() {
		synchronized (Counter1.class) {//class level lock
			count++;
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(count);
		}
		
	}
}
