package com.techchefs.exception.basics;

public class CheckName extends RuntimeException {
	private String message = "Message entered is less than five characters";
	
	CheckName(){
		this.getMessage();
	}
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return message;
	}
}
