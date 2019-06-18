package com.techchefs.javaapp.logger;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestB {
	
	private static final Logger Loger = Logger.getLogger("flipkart");
	
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		Loger.setLevel(Level.ALL);
		
		try {
			FileHandler fh = new FileHandler("myLogData.log",true);
			fh.setLevel(Level.ALL);
			fh.setFormatter(new SimpleFormatter());
			Loger.addHandler(fh);
			
			Loger.log(Level.SEVERE,"Serever message");
			Loger.log(Level.WARNING,"Warning message");
			Loger.log(Level.INFO,"Info message");
			Loger.log(Level.CONFIG,"Config message");
			Loger.log(Level.FINE,"Fine message");
			Loger.log(Level.FINER,"Finer message");
			Loger.log(Level.FINEST,"Finest message");
			
			BuyProduct bt = new BuyProduct();
			bt.buy();
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
