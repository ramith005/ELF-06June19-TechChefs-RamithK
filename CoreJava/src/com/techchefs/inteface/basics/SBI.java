package com.techchefs.inteface.basics;

public class SBI implements AtmCard {

	@Override
	public void validateCard() {
		System.out.println("Validate the SBI Card");

	}

	@Override
	public void getCardInfo() {
		System.out.println("Get the SBI Card Info");

	}

}
