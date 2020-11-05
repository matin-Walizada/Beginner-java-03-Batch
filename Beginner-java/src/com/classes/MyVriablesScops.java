package com.classes;

public class MyVriablesScops {
	// there are 3 types of Variables
	// 1 insctance variable?
	// instance variables are those variables are declared inside class cure bracess
	
	
	private  int accountNumber = 200;
	public String accountHolderName = "samim";
	
	// 2 static variable?
	// a static variable declares in side the class with static keyword these are class variables not object variabls
	public static String collage = "HARVARD";
	
	
	
	// 3 Local variables? 
	// local variables are those variables which are declared inside a method
	  
	public int info() {
		
		int x = 20;
		int y = 80;
		
		return x + y;
	}
	
	
	public static void main(String[] args) {
	// how to access all three variables values?
		
		// instance variable are accessible through object.
		
		MyVriablesScops z = new MyVriablesScops();
		
		System.out.println(z.accountNumber);
		System.out.println(z.accountHolderName);
		
		// static variable are accessable drictly, through name of the class, through object
		
		System.out.println(collage);
		System.out.println(MyVriablesScops.collage);
		System.out.println(z.collage);
	

		
		
		// local  variable are accessible through object.
		System.out.println(z.info());
		
	}
	
	
	
	
	
	
	
	
	

}
