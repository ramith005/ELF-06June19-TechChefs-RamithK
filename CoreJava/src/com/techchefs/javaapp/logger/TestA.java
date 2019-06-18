package com.techchefs.javaapp.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestA {

	private static final Logger Loger = Logger.getLogger("TestLog");
	
	public static void main(String[] args) {
		
		LogManager.getLogManager().reset();
		Loger.setLevel(Level.ALL);
		
		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.FINE);
		Loger.addHandler(ch);
		
		Loger.log(Level.SEVERE,"Serever message");
		Loger.log(Level.WARNING,"Warning message");
		Loger.log(Level.INFO,"Info message");
		Loger.log(Level.CONFIG,"Config message");
		Loger.log(Level.FINE,"Fine message");
		Loger.log(Level.FINER,"Finer message");
		Loger.log(Level.FINEST,"Finest message");
	}

}
