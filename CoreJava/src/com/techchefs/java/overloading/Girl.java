package com.techchefs.java.overloading;

public class Girl {

	void receive(Phone p) {

		System.out.println(p.getClass().getName());
		if (p instanceof IPhone) {
			System.out.println("I love you");
		} else if (p instanceof MIPhone) {
			System.out.println("Thank you Bro");
		}
	}
}
