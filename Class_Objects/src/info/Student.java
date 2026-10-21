package info;

public class Student {

	// 10 Fields
	int studentId;
	String studentName;
	int age;
	String gender;
	String course;
	String collegeName;
	String email;
	long phoneNumber;
	double marks;
	boolean isPassed;

	//Display student details
	void displayDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Name: " + studentName);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Course: " + course);
		System.out.println("College: " + collegeName);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phoneNumber);
		System.out.println("Marks: " + marks);
		System.out.println("Passed: " + isPassed);
	}

	// Study
	void study() {
		System.out.println(studentName + " is studying.");
	}

	//  Attend lecture
	void attendLecture() {
		System.out.println(studentName + " is attending a lecture.");
	}

	//Calculate percentage
	double calculatePercentage(double obtainedMarks, double totalMarks) {
		return (obtainedMarks / totalMarks) * 100;
	}

	//Check result
	void checkResult() {
		if (isPassed) {
			System.out.println(studentName + " has passed.");
		} else {
			System.out.println(studentName + " has failed.");
		}

	}

}
