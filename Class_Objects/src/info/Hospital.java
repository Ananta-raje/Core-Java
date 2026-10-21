package info;


public class Hospital {
	int hospitalId;
	String hospitalName;
	String location;
	String doctorName;
	int totalBeds;
	int availableBeds;
	int totalDoctors;
	double consultationFee;
	long contactNo;
	boolean isEmergencyAvailable;

	void displayDetails() {

		System.out.println("Hospital ID: " + hospitalId);
		System.out.println("Hospital Name: " + hospitalName);
		System.out.println("Location: " + location);
		System.out.println("Doctor Name: " + doctorName);
		System.out.println("Total Beds: " + totalBeds);
		System.out.println("Available Beds: " + availableBeds);
		System.out.println("Total Doctors: " + totalDoctors);
		System.out.println("Consultation Fee: " + consultationFee);
		System.out.println("Contact Number: " + contactNo);
		System.out.println("Emergency Available: " + isEmergencyAvailable);
	}

	

	void admitPatient() {
		if (availableBeds > 0) {
			availableBeds--;
			System.out.println("Patient admited sucessfully");
		}else {
			System.out.println("Patient is not admitted!!");
		}
		
	}

	void dischargePatient() {
		if (totalBeds > availableBeds) {
			availableBeds++;
			System.out.println("Patient descharge sucessfully");
		}else {
			System.out.println("Patient not discharged !!");

		}
	}

	void addBeds(int count) {
		
		if (count > 0) {
			totalBeds += count;
			availableBeds += count;
			System.out.println(count + " Beds added sucessfully");
		}else {
			System.out.println("Please add valid beds");
		}
	}

	void checkBedAvailabilty() {
		System.out.println(availableBeds + " Available beds");
	}

}
