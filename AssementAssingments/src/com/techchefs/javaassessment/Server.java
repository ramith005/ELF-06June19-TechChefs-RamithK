package com.techchefs.javaassessment;

import java.util.logging.Logger;
/**
 * 
 * @author Ramith
 * 24)	WAP to create a custom exception to validate the temperature of the server room. (Eg: If the temperature is more that 18 degrees, there should be an exception)
 */
public class Server {
	Logger log = Logger.getLogger("Server");
	
	double getServerRoomTemp(double temp) throws MaximumTemperatureException {
		if (temp >= 18) {
			throw new MaximumTemperatureException();
		} else {
			return temp;
		}
	}
}
