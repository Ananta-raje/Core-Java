package com.practice;

public class MainClass {
	public static void main(String[] args) {

		Demo d1 = new Demo();
		
		//1
		System.out.println(d1.addTwo(10, 20));
		
		
		//2
		String name = "Hello, Ananta!";
		
		d1.printInfo(name);
		
		//3
		System.out.println(d1.age());
		
		//4
		d1.info();
		
		//5
		System.out.println(d1.square(5));
		
		//6
		System.out.println(d1.isEven(7));
		
		//7
		d1.stuInfo("Ananta", 23, 86);
		
		//8
		System.out.println(d1.num());
		
		//9
		System.out.println(d1.greaterNo(9, 5));
		
		//10
		d1.printNo();
		
		//11
		System.out.println();
		System.out.println(d1.simpleInterest(10000, 5, 2));
		
		//12
		System.out.println(d1.vote(23));
		
		//13
		System.out.println(d1.factorial(5));
		
		//14
		
		d1.empInfo();
		
		//15
		System.out.println(d1.getLength("Java"));
		
		//16
		System.out.println(d1.convertToFahrenheit(0));
		
		//17
		d1.printTable(5);
		
		//18
		System.out.println(d1.checkNo(6));
		
		
		//19
		System.out.println(d1.avg(10, 20, 30));
		
		//20
		System.out.println(d1.greatestOfThree(19, 5, 30));
		
		//21
		BankAccount b1 = new BankAccount();
		double currBal = b1.withdrawBal(2000);
		
		System.out.println("Remaining balance: "+ currBal );
		
		
		//22
		Product rice = new Product();
		
		double m1 = rice.price = 250;
		int q = rice.quantity = 4;
		double finalBill = rice.calculator(m1, q);
		System.out.println(finalBill);
		
		//23
		
		Product sugar = new Product();
		
		double sugarPrice = sugar.price = 2000;
		int dis = sugar.discount = 10;
		
		double finalPrice = sugar.calfinalPrice(sugarPrice, dis);
		System.out.println(finalPrice);	
		
		//24
		Student s1 = new Student();
		
		char result = s1.result(58);
		System.out.println("Student grade is: "+result);
		
		//25
		System.out.println(d1.isPalindrome(121));
		
		//26
		System.out.println(d1.countDigit(12355444));
		
		//27
		System.out.println("Rs."+d1.billCalcutor(250));
		
		//28
		Atm a1 = new Atm();
		a1.displayMenu();
		
		//check balance
		double balance = a1.checkBalance();
		System.out.println(balance);
		
		//After deposite
		double updatedBalD = a1.deposite(500);
		System.out.println(updatedBalD);
		
		//After withdrawal
		double updatedBalW = a1.withdraw(-200);
		System.out.println(updatedBalW);
		
		
		//29
		Employee e2 = new Employee();
		
		System.out.println(e2.empBonusCal(40000, 2));
		
		
		//30
		
		MinCalculator c1 = new MinCalculator();
		
		System.out.println("The add of a and b is : "+c1.add(1, 2));
		c1.subtract(5, 1);
		System.out.println("The multiplication of a and b : "+ c1.multiply(2, 3));
		System.out.println("The div of a and b is : "+ c1.divide(2, 3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
