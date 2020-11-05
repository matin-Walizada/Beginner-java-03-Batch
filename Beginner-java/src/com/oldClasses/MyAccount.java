package com.oldClasses;

import com.classes.HellowWorld;

public class MyAccount  {
	
	
	

	// ACCCESS MODIFIER + DATA TYPES + VARIABLE
	
	 //boolean, char, byte, short, int, long, float, double
//	
//			byte: =  127 and -128
//			short: = 32767 and -32768 
//			int:  = 2147483647 and -2147483648
//			long: 9223372036854775807 and - -9223372036854775808 

		public boolean isbeCamePresedent = true;
		public char firstLitter = 'T';
			
		byte account1 = 41;
		short account2 = -32768;
		int acccounyt3 = -2147483648;
		
		long account4 = 9223372036854775807L;
		float gpa = 3.5f;
		double salart = 342342.34;
	
					public String name = "Samim";
					public static String lastName = "kamal";
	
	public static void main(String[] args) {
	 MyAccount obj1 = new MyAccount();
	 MyAccount obj2 = new MyAccount();
	 MyAccount obj3 = new MyAccount();
	 
	 obj1.name = "shabnam";
	 System.out.println(obj1.name);
	 System.out.println(obj2.name);
	 System.out.println(obj3.name);
	 
	 obj1.lastName = "farhadi";
	 
	 System.out.println(obj1.lastName);
	 System.out.println(obj2.lastName);
	 System.out.println(obj3.lastName);
	 
		 
	}

}
