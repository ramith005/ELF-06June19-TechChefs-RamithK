package com.techchefs.specifiers.basics;

public class TestA {

	public static void main(String[] args) {
		Person p = new Person();
		p.m.call();
		System.out.println("The value if is is "+p.i);
		p.walk();
		
		System.out.println("*******************");
		
		MusicSystem ms = new MusicSystem();
		ms.c.testMethod();
		ms.c.move();
	}

}
