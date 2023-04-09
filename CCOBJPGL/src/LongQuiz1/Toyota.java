package LongQuiz1;

class Vehicle {
	public String VehicleType() {
		String vehicle = "Vehicle type is Car";
		return vehicle;
	}
}

class Car extends Vehicle {
	public String Brand() {
		String brand = "Brand is Toyota";
		return brand;

	}

	public String Model() {
		String model = "Model is Camry";
		return model;
	}
}

public class Toyota extends Car {
	public String Color() {
		String color = "Color is Red";
		return color;
	}

	public String Speed() {
		String speed = "Speed is 120kph";
		return speed;
	}

	public static void main(String[] args) {

		Toyota tyt = new Toyota();

		System.out.println(tyt.VehicleType());
		System.out.println(tyt.Brand());
		System.out.println(tyt.Model());
		System.out.println(tyt.Speed());

	}
}
