package com.techchefs.assignment.streams;

public enum Gender {

	MALE('m'), FEMALE('f'), OTHER('o');
	char val;

	private Gender(char val) {
		this.val = val;
	}

	public char getGender() {
		return val;
	}
}
