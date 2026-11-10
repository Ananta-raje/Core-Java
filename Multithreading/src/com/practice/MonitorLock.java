package com.practice;

public class MonitorLock {
//	public static void main(String[] args) throws InterruptedException {
//
//		Cc c1 = new Cc();
//		
//		Thread t1 = new Thread(() -> {
//			for(int i = 1; i <= 10000; i++) {
//				c1.increment();
//			}
//		});
//		
//		Thread t2 = new Thread(() -> {
//			for(int i = 1; i <= 10000; i++) {
//				c1.increment();
//			}
//		});
//		
////		System.out.println(t1.getState());
////		System.out.println(t2.getState());
//		
//		t1.start();
//		t2.start();
//		
//		t1.join();
//		t2.join();
//		System.out.println(c1.count);
//	}

//
//	public static void main(String[] args) {
//		TTest tt = new TTest();
//
//		Thread t1 = new Thread(() -> tt.show());
//		Thread t2 = new Thread(() -> tt.show());
//
//		t1.start();
//		t2.start();
//	}

	public static void main(String[] args) {
		Show s1 = new Show();//Every obj has its internal lock

		Thread t1 = new Thread(() -> s1.m1());
		Thread t2 = new Thread(() -> s1.m2());

		t1.start();
		t2.start();

	}
}

class Cc {
	int count;

	synchronized void increment() {//use synchronized to avoid race condition
		count++;

	}
}

class TTest {
	synchronized void show() {
		System.out.println(Thread.currentThread().getName() + ": Show start");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}

		System.out.println(Thread.currentThread().getName() + ": Show end");
	}
}

class Show {

	synchronized void m1() {
		System.out.println("M1 start");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("M1 end");
	}

	synchronized void m2() {
		System.out.println("M2 start");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("M2 end");
	}
}
