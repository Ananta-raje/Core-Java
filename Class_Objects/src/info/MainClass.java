package info;

public class MainClass {
	public static void main(String[] args) {

		// Creating Object
//		Student s1 = new Student();
//		s1.studentId = 101;
//		s1.studentName = "Ananta";
//		s1.email = "123@gmail.com";
//		s1.age = 23;
//		s1.gender = "Male";
//		s1.isPassed = true;
//		s1.marks = 89;
//		s1.phoneNumber = 787515378;
//		s1.collegeName = "Tgpcet";
//		s1.course = "Java";
//
//		s1.displayDetails();
//		s1.study();
//		s1.attendLecture();
//		
//		
//		double percentage = s1.calculatePercentage(427, 500);
//		System.out.println("Percentage: " + percentage + "%");
//		s1.checkResult();

		// creating object

		Employee e1 = new Employee();
		
		e1.employeeId = 101;
		e1.employeeName = "Ananta";
		e1.age = 23;
		e1.gender = "Male";
		e1.department = "IT";
		e1.designation = "Java developer";
		e1.email = "abc@gmail.com";
		e1.phoneNumber = 772098762;
		e1.salary = 35000;
		e1.isPermanent = true;
		
		e1.displayDetails();
		e1.work();
		e1.attendMeeting();
		
		double annualSalary = e1.calculateAnnualSalary();
		
		System.out.println("Annual salary : "+ annualSalary);
		e1.checkPermanentStatus();

		// creating objects
//		Library l1 = new Library();
//
//		l1.libraryId = 101;
//		l1.libraryName = "Knowledge Hub";
//		l1.location = "Pune";
//		l1.librarianName = "Ananta";
//		l1.totalBooks = 500;
//		l1.availableBooks = 400;
//		l1.issuedBooks = 100;
//		l1.membershipFee = 500.0;
//		l1.openingTime = "9:00 AM";
//		l1.isOpen = true;
//
//		l1.displayDetails();
//		System.out.println("-----------------------------------------");
//
//		l1.checkAvailabilty();
//
//		// issue book
//		l1.issueBook();
//
//		l1.checkAvailabilty();
//
//		// return book
//		l1.returnBook();
//
//		l1.checkAvailabilty();
//
//		// add more books
//
//		l1.addBooks(30);
//		l1.checkAvailabilty();

		// creating object

//		Hospital h1 = new Hospital();
//		
//		h1.hospitalId = 101;
//		h1.hospitalName = "Oxford";
//		h1.location = "Pune";
//		h1.doctorName = "Dr. Ananta Raje";
//		h1.totalBeds = 200;
//		h1.availableBeds = 50;
//		h1.totalDoctors = 20;
//		h1.consultationFee = 500.0;
//		h1.contactNo = 876543210L;
//		h1.isEmergencyAvailable = true;
//		
//		
//		h1.displayDetails();
//		System.out.println("-----------------------------");
//		h1.checkBedAvailabilty();
//		
//		System.out.println("-----------------------------");
//		h1.admitPatient();
//		
//		
//		h1.checkBedAvailabilty();
//		
//		System.out.println("-----------------------------");
//
//	    h1.dischargePatient();
//	    
//		h1.checkBedAvailabilty();
//		
//		System.out.println("-----------------------------");
//
//		h1.addBeds(50);
//		
//		h1.checkBedAvailabilty();

		// creating object
//		Vehicle v1 = new Vehicle();
//
//		v1.vehicleId = 111;
//		v1.brand = "Tata";
//		v1.model = "Nexon";
//		v1.color = "Black";
//		v1.vehicleType = "SUV";
//		v1.fuelType = "Electric";
//		v1.speed = 0;
//		v1.price = 1500000;
//		v1.manufacturingYear = 2026;
//		v1.isElectric = true;
//		
//		v1.displayDetails();
//		
//		System.out.println("-----------------------");
//		
//		v1.start();
//		
//		System.out.println("-----------------------");
//
//		v1.stop();
//		
//		System.out.println("-----------------------");
//
//		
//		v1.accelerate(20);
//		
//		System.out.println("----------------------");
//		v1.brake(20);
//		System.out.println("Vehicle stoped");

	}
}
