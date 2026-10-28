package com.tka;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person();
		Demographics d = p1.getDetails(23, "Ananta");
		
		Location ll = d.giveAddress();
		
		String city = ll.getCityName();
		System.out.println(city);
		
	}
}
