package com.techchefs.app.enumurator;

public enum Loan {
	HOME(100),PERSONAL(101),CAR(102);
	
	private int value;
	
	private Loan(int value){
		this.value =value;
	}
	
	public int getValue() {
		return value;
	}
}
