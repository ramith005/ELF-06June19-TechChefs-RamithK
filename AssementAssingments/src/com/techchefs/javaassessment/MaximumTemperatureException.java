package com.techchefs.javaassessment;

import java.util.Arrays;
/**
 * 
 * @author Ramith
 * 24)	WAP to create a custom exception to validate the temperature of the server room. (Eg: If the temperature is more that 18 degrees, there should be an exception)
 */
public class MaximumTemperatureException extends RuntimeException {

	String message;
	
	MaximumTemperatureException() {
		message = "High server room temperature";
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
