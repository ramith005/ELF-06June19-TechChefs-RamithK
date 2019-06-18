package com.techchefs.java.overloading;
class Animal{
	void eat() {
		System.out.println("Anmial eat function");
	}
}

class Cow extends Animal{
	void eat() {
		System.out.println("Cow eat function");
	}
}

class Lion extends Animal{
	void eat() {
		System.out.println("Lion eat function");
	}
}

public class TestB {
	public static void main(String[] args) {
		Animal a= new Animal();
		
		a.eat();
	}
}
