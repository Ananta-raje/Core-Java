package com.practice;

public class ThreadLifeCycle {
	public static void main(String[] args) {
		// Thread stages
		Thread t1 = new Thread(() -> {
			System.out.println("Name of the current thread is: " + Thread.currentThread().getName());
		});

		System.out.println(t1.getState());// New --> Thread object is created but not started
		t1.start();
		System.out.println(t1.getState());// RUNNABLE-->Thread is ready to run or currently running. OR TERMINATED -->
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		System.out.println(t1.getState());// RUNNABLE
		
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		System.out.println(t1.getState());
	}
}
