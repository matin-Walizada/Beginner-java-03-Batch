package com.classes;

import java.util.LinkedList;

public class EmployeeAddress {
	
	// how many kinds of Class are there in java?
	// there are two kinds of classes
	//1 the classes that create 
	// 2 there classes are already exist in java 
	
			public String myEmpAdress = "100 wall street";
			public String street = myEmpAdress;
			public String state =  "NEW YORK";
			public String city =  "Manhatan";
			public int zipCode  = 10200;
			public int apt = 30;
			
			

	// main method 
	// 1 write  2 compiler Compilation  3// JVM  Run 
	
	public static void main(String[] args) {
		 // we need to create object of our class. 
		EmployeeAddress myEmployeeAddress = new EmployeeAddress();
		System.out.println(myEmployeeAddress.street);
		System.out.println(myEmployeeAddress.state);
		System.out.println(myEmployeeAddress.city);
		System.out.println(myEmployeeAddress.zipCode);
		
			 System.out.println();
	}
	
	
	
	

}
