package info;

public class Vehicle {

	int vehicleId;
	String brand;
	String model;
	String color;
	String vehicleType;
	String fuelType;
	double speed;
	double price;
	int manufacturingYear;
	boolean isElectric;

	void displayDetails() {
		System.out.println("Vehicle ID: " + vehicleId);
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Speed: " + speed + " km/h");
		System.out.println("Price: " + price);
		System.out.println("Manufacturing Year: " + manufacturingYear);
		System.out.println("Electric Vehicle: " + isElectric);
	}

	void start() {
		if (speed == 0) {
			System.out.println(brand + " " + model + " " + " has started sucessfully!!");
		}
	}

	void stop() {
		speed = 0;
		System.out.println(brand + " " + model + " has stopped.");
	}

	void accelerate(double increase) {

		if (increase > 0) {
			speed += increase;
			System.out.println("Current speed : " + speed + " km/hr");
		}else {
			System.out.println("Current speed : " + speed + " km/hr");

		}
		
	}

	void brake(double decrease) {
		
		if (decrease > 0) {
			speed -= decrease;
			
			if (speed < 0) {
				speed = 0;
			}
			System.out.println("Current speed : " + speed + " km/hr");
			
		}else {
			System.out.println("Decreases speed should be positive");
		}
	}
}
