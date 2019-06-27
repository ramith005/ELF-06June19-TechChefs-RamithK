package com.techchefs.app.doublecolon;

public class TestH {

	static int sum(int a ,int b) {
		int c =a+b;
		return c;
	}

	public static void main(String[] args) {
		DemoCls dc = new DemoCls();
		
		MyFactorial f = dc :: myFact;
		
		int i = f.getFact(5);
		
		System.out.println("Factorial is "+i);
	}

}
