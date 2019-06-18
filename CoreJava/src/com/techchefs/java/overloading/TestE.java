package com.techchefs.java.overloading;

public class TestE {
	
	public static void main(String[] args) {
		Audi a = new Audi();
		Benz b =  new Benz();
		
		//PoshCar pc = new PoshCar();
		Driver d = new Driver();
		
		d.driveCar(a);
		//d.driveCar(b);
	}
}
