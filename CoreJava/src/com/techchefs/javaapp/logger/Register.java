package com.techchefs.javaapp.logger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	private static final Logger Loger = Logger.getLogger("amazon");
	void log() {
		System.out.println("Log method called");
		Loger.log(Level.SEVERE,"Serever message - log");
		Loger.log(Level.WARNING,"Warning message - log");
		Loger.log(Level.INFO,"Info message - log");
		Loger.log(Level.CONFIG,"Config message - log");
		Loger.log(Level.FINE,"Fine message - log");
		Loger.log(Level.FINER,"Finer message - log");
		Loger.log(Level.FINEST,"Finest message - log");
	}
	
	void store() {
		Loger.log(Level.SEVERE,"Serever message - store");
		Loger.log(Level.WARNING,"Warning message - store");
		Loger.log(Level.INFO,"Info message - store");
		Loger.log(Level.CONFIG,"Config message - store");
		Loger.log(Level.FINE,"Fine message - store");
		Loger.log(Level.FINER,"Finer message - store");
		Loger.log(Level.FINEST,"Finest message - store");
	}
}
