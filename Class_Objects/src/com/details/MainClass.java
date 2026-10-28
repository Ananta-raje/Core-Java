package com.details;

public class MainClass {

	public static void main(String[] args) {
		Country c1 = new Country();
		State s1 = c1.getState();
	    District d1 = s1.getDistrict();
	    Villege v1 = d1.getVillInfo();
	    String name = v1.getVillageName();
	    
	    System.out.println(name);
		
	}
}
