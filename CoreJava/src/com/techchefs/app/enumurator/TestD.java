package com.techchefs.app.enumurator;

import lombok.extern.java.Log;

@Log
public class TestD {
	public static void main(String[] args) {
		try {
			
		} catch(ArithmeticException | NullPointerException e) {
			log.info("Exception"+e.getMessage());
		} catch(Exception e) {
			log.info("General Exception"+e.getMessage());
		}
	}
	
	
}
