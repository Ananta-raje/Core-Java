
public class Student {
	int stuId;
	String stuName;
	int age;
	int marks;
	boolean isPassed;

	// Non-parametrized with no return type
	public void displayDetails() {
		System.out.println("Student ID: " + stuId);
		System.out.println("Student Name: " + stuName);
		System.out.println("Student age: " + age);
		System.out.println("Student marks: " + marks);
	}
	
	
	// Non-parametrized with return type
	public int calMarks() {
		return marks;
	}
	
	
	// Parameterized with return type
	public int updatedMarks(int newMarks) {
		marks += newMarks;
		return marks;
	}
	
	
	//Parameterized without return type
	public void result(boolean isPassed) {
		if (isPassed) {
			System.out.println("Student is passed");
		}else {
			System.out.println("Student is fail");
		}
	}
	
}
