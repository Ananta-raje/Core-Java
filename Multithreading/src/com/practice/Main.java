package com.practice;

public class Main {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" thread is running");
		// MyThread t1 = new MyThread();

		// t1.start();//t1.start() --> JVM ask os to create new thread --> Thread get
		//t1.start();//we cannot start same method again again --> Exception --> illegalthreadException
		// its own stack/pc space --> Thread exection run()
		
		
		MyRunnable m1 = new MyRunnable();
		Thread t2 = new Thread(m1);
		t2.start();
		
	
	}

}

//1)By extending thread class
//class MyThread extends Thread {
//	@Override
//	public void run() {
//		System.out.println("Thread is running!!");
//	}
//}

//2)By implementing runnable interface
class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread is running!!");
	}
}
