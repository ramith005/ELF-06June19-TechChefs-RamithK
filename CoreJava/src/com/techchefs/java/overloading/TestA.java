package com.techchefs.java.overloading;

public class TestA {

	public static void main(String[] args) {
		Train t = new Train();
		
		t.search(123);
		System.out.println("*************");
		t.search("Abcd");
	}

}
