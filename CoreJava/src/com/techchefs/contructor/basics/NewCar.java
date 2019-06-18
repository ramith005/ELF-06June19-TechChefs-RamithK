package com.techchefs.contructor.basics;

public class NewCar {
	double fuelLiters;
	
	NewCar(double fuelLiters){
		this.fuelLiters =  fuelLiters;
		System.out.println("New Car is initiated with "+this.fuelLiters+" Liters");
	}
}
