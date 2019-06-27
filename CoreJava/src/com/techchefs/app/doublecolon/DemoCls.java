package com.techchefs.app.doublecolon;

public class DemoCls {
	static void sum(int a ,int b) {
		System.out.println("Result is "+(a+b));
	}
	
	double average(int i, int j, int k) {
		double avg;
		avg = (i+j+k)/3.0;
		return avg;
	}
	
	int myFact(int num) {
		int f = 1;
		for(int i=1;i<=num;i++) {
			f = f * 1;
		}
		return f;
	}
}
