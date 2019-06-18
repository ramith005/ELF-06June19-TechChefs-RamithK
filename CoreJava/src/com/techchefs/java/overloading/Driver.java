package com.techchefs.java.overloading;

public class Driver {

	void driveCar(PoshCar pc) {
		if(pc instanceof Audi) {
			System.out.println("Drive the Benz");
		}else if(pc instanceof Benz) {
			System.out.println("Drive the Audi");
		}
	}
}
