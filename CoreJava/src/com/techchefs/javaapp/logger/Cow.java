package com.techchefs.javaapp.logger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cow extends Animal {
	private static final Logger Loger = Logger.getLogger("animal");
	void sound() {
		System.out.println("Sound method of Cow");
		Loger.log(Level.SEVERE,"Serever message Cow");
		Loger.log(Level.WARNING,"Warning message Cow");
		Loger.log(Level.INFO,"Info message Cow");
		Loger.log(Level.CONFIG,"Config message Cow");
		Loger.log(Level.FINE,"Fine message Cow");
		Loger.log(Level.FINER,"Finer message Cow");
		Loger.log(Level.FINEST,"Finest message Cow");
	}
	
	void div(int a ,int b) {
		System.out.println("Divison by a/b - Cow");
	}
}
