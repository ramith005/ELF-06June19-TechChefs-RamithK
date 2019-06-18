package com.techchefs.array.basics;

public class TestArray {

	public static void main(String[] args) {
		double a[] = new double[4];
		
		a[0] = 5.1;
		a[1] = 15.4;
		a[2] = 13.2;
		a[3] = 10.0;
		
		for(int i=0;i<=3;i++) {
			System.out.println("a["+i+"] is " +a[i]);
		}

	}

}
