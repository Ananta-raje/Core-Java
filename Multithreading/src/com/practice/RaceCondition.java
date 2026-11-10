package com.practice;

public class RaceCondition {
	public static void main(String[] args) {
		Counter c1 = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				c1.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				c1.increment();
			}
		});
		
		
		t1.start();
		t2.start();
		
		try {
			t1.join(2000);
//			t2.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c1.count);
		
	}

}

class Counter {
	int count = 0;

	  void increment() {
		count++;
	}
}
