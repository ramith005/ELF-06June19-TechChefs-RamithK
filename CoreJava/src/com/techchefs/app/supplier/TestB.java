package com.techchefs.app.supplier;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class TestB {

	public static void main(String[] args) {
		Supplier<Car> c = ()->new Car(15.2);
		Car ca = c.get();
		log.info("Car fuel "+ca.fuelLiters);
	}

}
