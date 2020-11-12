package com.classes;

public class Employees {

	// properties
	
	int id;
	String name;
	double salary;
	String position;
	
	
	// constructor
	
	// how many kinds of constructor are there in java?
	// there 3 kinds of constructor
	
	//1 Default constructor 
	//2 no argument constructor
	//3 Parameterized constructor 
	
	public Employees() {
		
		
	}
	
	public Employees(int employeeId, String employeeName, double employeeSalary, String  employeePositoin ) {
		
		this.id =  employeeId;
		this.name = employeeName;
		this.salary = employeeSalary;
		this.position = employeePositoin;
		
	}
	
	
	// methods
	// what is method 
	// methods show the behaviosr of objects
	
// access modifier + data + nameOFMethod+ pranthesise + curly braces
	
	public int showAge( int a, int b) {
		
		return a + b;
	}
	
	

	
	// behavior
	
	public String getSalary() {
		
		
		return "every employee in this postion gets 100 k";
	}
	
	
	String	wrieCods(){
			
			return "every deve writs code to develop application";
		}
	
	String help() {
		
		return "ever dev should help other friends";
	}
	
	
	// toString()
	
//	@Override
//	public String toString() {
//		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary + ", position=" + position
//				+ ", getSalary()=" + getSalary() + ", wrieCods()=" + wrieCods() + ", help()=" + help() + "]";
//	}
	
	
	public static void main(String[] args) {
		 
			// name of our class + aname + = + new + constructor();
		
		Employees  theEmployee = new Employees(10, "kamal", 120, "developer" );
		System.out.println(theEmployee);
		
	
		Employees theEmployees1 = new Employees(20, "shabana", 130, "lead dev");
		
		System.out.println(theEmployees1);
		
		Employees theEmployees2 = new Employees(30, "samira",200, "maneger deve" );
		
		System.out.println(theEmployees2);
		
		
		
		
//		System.out.println("ID: " + theEmployee.id);
//		System.out.println( "Name: " + theEmployee.name);
//		System.out.println( "salary : " + theEmployee.salary);
//		System.out.println("positon : " + theEmployee.position);
//		
//		System.out.println(theEmployee.getSalary());
//		System.out.println(theEmployee.wrieCods());
//		System.out.println(theEmployee.help());
		
		
	 Employees theEmployees7 = new Employees();
	 System.out.println(theEmployees7.showAge(10, 15));
		
		 
		
	}



}
