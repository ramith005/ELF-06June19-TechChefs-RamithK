package com.techchefs.javaapp.logger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyProduct {
	private static final Logger Loger = Logger.getLogger("flipkart");
	void buy() {
		Loger.log(Level.SEVERE,"buy Serever message");
		Loger.log(Level.WARNING,"buy Warning message");
		Loger.log(Level.INFO,"buy Info message");
		Loger.log(Level.CONFIG,"buy Config message");
		Loger.log(Level.FINE,"buy Fine message");
		Loger.log(Level.FINER,"buy Finer message");
		Loger.log(Level.FINEST,"buy Finest message");
	}
}
