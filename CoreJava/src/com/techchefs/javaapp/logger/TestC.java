package com.techchefs.javaapp.logger;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestC {
	
	private static final Logger Loger = Logger.getLogger("animal");
	public static void main(String[] args) {
		
		LogManager.getLogManager().reset();
		Loger.setLevel(Level.ALL);
		
		try {
			FileHandler fh = new FileHandler("animal.log",true);
			
			fh.setFormatter(new SimpleFormatter());
			Loger.addHandler(fh);
			
			Loger.log(Level.SEVERE,"Serever message");
			Loger.log(Level.WARNING,"Warning message");
			Loger.log(Level.INFO,"Info message");
			Loger.log(Level.CONFIG,"Config message");
			Loger.log(Level.FINE,"Fine message");
			Loger.log(Level.FINER,"Finer message");
			Loger.log(Level.FINEST,"Finest message");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Animal a = new Animal();
		a.sound();
		a.div(10, 2);
		System.out.println("********");
		Cow c  = new Cow();
		c.sound();
		c.div(10, 2);
		System.out.println("********");
		Lion l  = new Lion();
		l.sound();
		l.div(10, 2);

	}

}
