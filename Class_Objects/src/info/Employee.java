package info;

public class Employee {
	int employeeId;
	String employeeName;
	int age;
	String gender;
	String department;
	String designation;
	String email;
	long phoneNumber;
	double salary;
	boolean isPermanent;

	void displayDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Department: " + department);
		System.out.println("Designation: " + designation);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Monthly Salary: " + salary);
		System.out.println("Permanent Employee: " + isPermanent);
	}

	void work() {
		System.out.println(employeeName + " is working");
	}

	void attendMeeting() {
		System.out.println(employeeName + " is attending a meeting");
	}

	double calculateAnnualSalary() {
		return salary * 12;
	}

	void checkPermanentStatus() {
		if (isPermanent) {
			System.out.println(employeeName + " is a permanent employee");
		} else {
			System.err.println(employeeId + " is not a permanent employee");
		}
	}
}
