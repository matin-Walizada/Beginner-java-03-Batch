package com.classes;

public class Car {
// objec is an entity which has propertis and behaviors
	public String name = "jeep";
	String model = "XYZ";
	int year = 2020;
	double price = 3000.00;
	String color = "white";

	// () {} []

	public String jeepSpeed() {

		return "100 mile per hour";

	}

	String jeepJum() {

		return "5 meter hight";
	}

	String selfDrive() {

		return "this car can be drive it selt";
	}

	public static void main(String[] args) {
		
		// we create our object
		// formula object 
		//name of our class + aname + = + new + contstructor();

		Car  myjeep = new Car();
		
		System.out.println(myjeep.name);
		System.out.println(myjeep.model);
		System.out.println(myjeep.year);
		System.out.println(myjeep.price);
		System.out.println(myjeep.color);
		
		System.out.println(myjeep.jeepSpeed());
		System.out.println(myjeep.jeepJum());
		System.out.println(myjeep.selfDrive());
		
		
		
	}

}
