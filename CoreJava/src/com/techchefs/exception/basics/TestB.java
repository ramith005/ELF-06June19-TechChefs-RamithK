package com.techchefs.exception.basics;

public class TestB {

	public static void main(String[] args) {
		Validate v = new Validate();
		try {
			v.printName("Ram");
		} catch(CheckName cn) {
			cn.getMessage();
		}
	}

}
