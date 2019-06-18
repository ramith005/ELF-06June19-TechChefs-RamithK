package com.techchefs.java.calculator;

public class TestA {

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		System.out.println("Add result is "+bc.add(1, 2));
		System.out.println("Sub result is "+bc.sub(4, 2));
		System.out.println("Mul result is "+bc.mul(4, 2));
		System.out.println("div result is "+bc.div(4, 2));
	}

}
