package com.practice;

public class MainClass {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		
		e1.setEmpName("Ananta");
		e1.setEmpId(101);
		e1.setAge(23);
		e1.setEmpSalary(35000);
		e1.setEmpDept("Dev");
		e1.setEmpExp(2);
		
		
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getAge());
		System.out.println(e1.getEmpExp());
		System.out.println(e1.getEmpDept());
		System.out.println(e1.getEmpSalary());

	}
}
