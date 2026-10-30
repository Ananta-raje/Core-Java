package com.test;

public class MainClass {
	private String name = "Ananta";

	public void printMessage() {
		System.out.println("Welcome to java!!");
	}

	public void add(int a, int b) {
		System.out.println("Sum of a + b is: " + (a + b));
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public String getName() {
		return name;
	}

	public boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}

//	public MainClass() {
//		System.out.println("Object created!!");
//	}

	public MainClass(String name) {
		this.name = name;
	}

	public MainClass(MainClass m1) {
		this.name = m1.name;

	}

	public void display() {
		System.out.println("Original obj: " + name);
	}

	public static void main(String[] args) {

		// 1
//		Student s1 = new Student();
//		
//		s1.setId(101);
//		s1.setName("Ananta");
//		
//		System.out.println(s1.getId());
//		System.out.println(s1.getName());

		// 2
//		BankAccount b1 = new BankAccount();
//		
//		System.out.println("Original bank balance: "+b1.getBalance());
//		
//		System.out.println("Balance after deposite: "+b1.deposit(2000));
//		System.out.println("Balance after withdraw: "+b1.withdraw(3000));

		// 3
//		Employee e1 = new Employee();
//		
//		e1.setSalary(1000);
//		System.out.println(e1.getSalary());

		// 4
//		Car c1 = new Car();
//		c1.setBrand("BMW");
//		c1.setPrice(2000000);
//		
//		System.out.println("Car brand: "+c1.getBrand());
//		System.out.println("Car price: "+c1.getPrice());

		// 5
//		Product p1 = new Product();
//
//		p1.setDiscount(15);
//		System.out.println("Available discount is : " + p1.getDiscount());

		// 6
//		MainClass m1 = new MainClass();
//		m1.printMessage();

		// 7
//		MainClass m2 = new MainClass();
//		m2.add(5, 2);

		// 8
//		MainClass m3 = new MainClass();
// 		System.out.println("Multiply of a * b is: "+ m3.multiply(5, 2));

		// 9
//		MainClass m4 = new MainClass();
//		System.out.println("My name is: " + m4.getName());

		// 10
//		MainClass m5 = new MainClass();
//		boolean result = m5.isEven(6);
//		if (result) {
//			System.out.println("Given no is Even");
//		}else {
//			System.out.println("Given no is odd");
//		}

		// 11
//		MainClass m4 = new MainClass();

		// 12
//		Book b = new Book("Atomic habbits", 350.0);
//		b.bookInfo();

		// 13
//		User u = new User();
//		User u1 = new User(23);

		// 14
//		MainClass m1 = new MainClass("Ananta");
//
//		MainClass m2 = new MainClass(m1);
//
//		m1.display();
//		m2.display();

		// 15
//		Rectangle r = new Rectangle(3, 2);
//		System.out.println("Area of a rectangle is : "+r.calArea());

		// 16
//		Account a1 = new Account(10000);
//		a1.deposit(1000);
//		a1.withdraw(5000);
//		System.out.println("Balance is: "+a1.getBalance());

		// 17
//		Student1 s = new Student1();
//		s.setName("Ananta");
//		s.setMarks(85);
//		
//		s.printDetails();

		// 18
//		Mobile m1 = new Mobile("I phone 15 pro", 65000);
//
//		System.out.println("Model is: " + m1.getModel());
//		System.out.println("Price of the model is: " + m1.getPrice());
//
//		System.out.println("Discounted Price is: " + m1.discount());
//		
//		System.out.println("----------------------------------------");
//
//		m1.setModel("Samsung");
//		m1.setPrice(150000);
//
//		System.out.println("Model is: " + m1.getModel());
//		System.out.println("Price of the model is: " + m1.getPrice());
//		System.out.println("Discounted Price is: " + m1.discount());
//		System.out.println();

		// 19
//		Employee1 ee = new Employee1("Ananta", 55000);
//		
//		System.out.println("Incremented salary is: "+ ee.increment());
//		System.out.println("Final salary is: "+ ee.finalSalry());

		// 20
		LibraryBook l1 = new LibraryBook(11, "Atomic habbits", "James clear");
		l1.displayDetails();

	}
}
