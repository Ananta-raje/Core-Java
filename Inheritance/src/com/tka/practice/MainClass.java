package com.tka.practice;

public class MainClass {
	public static void main(String[] args) {
		// 1
		B b1 = new B();
		b1.showA();
		b1.showB();

		// 2
		Child c = new Child();
		System.out.println(c.x);
		System.out.println(c.y);

		// 3
		Dog d = new Dog();
		d.eat();
		d.bark();

		// 4
		Car c1 = new Car();
		c1.start();
		c1.drive();

		// 5
		System.out.println(b1.a);
		System.out.println(b1.b);

		// 6
		C cc = new C();
		cc.showA();
		cc.showB();
		cc.showC();

		// 7
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);

		// 8
		SportsCar sc = new SportsCar();
		sc.start();
		sc.drive();
		sc.run();

		// 9
		d.IsLiving();
		d.eat();
		d.bark();

		// 10
		Z zz = new Z();
		zz.display();

		// 11
		Child1 ch = new Child1();
		ch.p();

		// 12

		// 13
		d.bark();
		d.eat();
		Cat cd = new Cat();
		cd.sound();
		cd.eat();
		
		//14
		C ccc = new C();
		ccc.m1();
		ccc.m2();
		ccc.m3();
		
		b1.m1();
		b1.m2();
		
		//15
		Student s = new Student();
		System.out.println(s.p);
		System.out.println(s.s);
		
		Teacher t = new Teacher();
		System.out.println(t.p);
		System.out.println(t.t);
		
		//16
		DD dd = new DD();
		dd.AA();
		dd.CC();
		dd.DD();
		
		//17
		Tiger tt = new Tiger();
		tt.eat();
		tt.sound();
		tt.type();
		
		
		

	}
}
