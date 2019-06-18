package com.techchefs.exception.basics;

public class Validate extends CheckName {
	
	void printName(String name) {
		
			if(name.length() < 5) {
				System.out.println("less than 5");
				throw new CheckName();
				
			} else {
				System.out.println("The passed name is "+name);
			}
		
	}
}
