package com.techchefs.javaapp.logger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lion extends Animal {
	private static final Logger Loger = Logger.getLogger("animal");
	void sound() {
		System.out.println("Sound method of Lion");
		Loger.log(Level.SEVERE,"Serever message Lion");
		Loger.log(Level.WARNING,"Warning message Lion");
		Loger.log(Level.INFO,"Info message Lion");
		Loger.log(Level.CONFIG,"Config message Lion");
		Loger.log(Level.FINE,"Fine message Lion");
		Loger.log(Level.FINER,"Finer message Lion");
		Loger.log(Level.FINEST,"Finest message Lion");
	}
	
	void div(int a ,int b) {
		System.out.println("Divison by a/b - Lion");
	}
}
