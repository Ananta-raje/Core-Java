package com.tka.methodoverloading;

public class Student {

	int id;
	int age;
	String name;

	// 7
	public Student() {
		// LOC
		System.out.println(id);
		System.out.println(name);
	}

	public Student(int id) {
		System.out.println(this.id = id);
	}

	public Student(int id, String name) {
		System.out.println(this.id = id);
		System.out.println(this.name = name);
	}

	public void display(String name) {
		System.out.println(age);

	}
	public void display(String name, int age) {
		System.out.println(age);
		System.out.println(name);

	}

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student(1);
		Student s2 = new Student(2, "Ananta");

		s2.display("Ananta");
		s2.display("Ananta", 23);

	}

}
