package com.classes;

public class HellowWorld {
	///1 inside class
	// 2 inside package
	//	3 outside package through child and parent 
	 protected  int accountNumber = 3000;
	 protected String name = "kamal";
	

	public static void main(String[] args) {
		HellowWorld obj = new HellowWorld(); 
		
		System.out.println(obj.accountNumber);
	}

}
