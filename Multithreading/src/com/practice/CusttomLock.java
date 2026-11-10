package com.practice;

public class CusttomLock {
	public static void main(String[] args) {
		Bank b1 = new Bank();

		Thread t1 = new Thread(() -> {
			b1.deposit();
		});

		Thread t2 = new Thread(() -> {
			b1.withdraw();
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Bank {

	void deposit() {
		synchronized (this) {//ye obj ke upar ka lock hai	
			System.out.println("Deposite logic");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	void withdraw() {
		synchronized (this) {//ye obj ke upar ka lock hai
			System.out.println("Withdraw logic");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
