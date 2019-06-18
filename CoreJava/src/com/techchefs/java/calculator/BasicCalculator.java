package com.techchefs.java.calculator;

public class BasicCalculator {
	int res;
	public int add(int a , int b) {
		res = a+b;
		return res;
	}
	
	public int sub(int a , int b) {
		res = a-b;
		return res;
	}
	
	public int mul(int a , int b) {
		res = a*b;
		return res;

	}
	
	public double div(int a , int b) {
		res = a/b;
		return res;
	}
}
