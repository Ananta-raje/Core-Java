package com.practice;

public class Demo extends Thread {

	@Override
	public void run() {
		for (;;) {
			System.out.println("world");
		}
	}

}
