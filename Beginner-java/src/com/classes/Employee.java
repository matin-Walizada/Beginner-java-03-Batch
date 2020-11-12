package com.classes;

public class Employee {

	
	// object properties
	int id = 10;
	String name = "Kamal";
	double salary = 100.30;
	String profision = "developer";

	// object behaviors
	String toDo() {

		return "develop the application and test it";
	}

	// object behavior
	String help() {

		return "helps other employees with thier issuse";
	}

	public static void main(String[] args) {
		// object 
		Employee theEmployee = new Employee();
		
		//calling properties and methods of object to show in the console.
			System.out.println(theEmployee.id);
			System.out.println(theEmployee.name);
			System.out.println(theEmployee.salary);
			System.out.println(theEmployee.profision);
			System.out.println(theEmployee.toDo());
			System.out.println(theEmployee.help());
			

	}

}
