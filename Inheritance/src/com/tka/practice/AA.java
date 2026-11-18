package com.tka.practice;

public class AA {
	void AA() {
		System.out.println("AA call");
	}
}

class BB extends AA {
	void BB() {
		System.out.println("BB call");
	}
}

class CC extends AA {
	void CC() {
		System.out.println("CC call");
	}
}

class DD extends CC {
	void DD() {
		System.out.println("DD  call");
	}
}