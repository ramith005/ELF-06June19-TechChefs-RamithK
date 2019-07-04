package com.techchefs.javaassessment;

import java.util.logging.Logger;
/**
 * 
 * @author Ramith
 * 24)	WAP to create a custom exception to validate the temperature of the server room. (Eg: If the temperature is more that 18 degrees, there should be an exception)
 */
public class ServerTest {
	static Logger log = Logger.getLogger("ServerTest");
	public static void main(String[] args) {
		Server s = new Server();
		
		try {
			double temp = s.getServerRoomTemp(20);
		    log.info("Temperature : "+temp);
		} catch(MaximumTemperatureException e) {
			log.info("Exception: "+e.getMessage());
		}
		
	}

}
