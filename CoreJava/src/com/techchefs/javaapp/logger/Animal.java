package com.techchefs.javaapp.logger;
import java.util.logging.Logger;

public class Animal {
	private static final Logger Loger = Logger.getLogger("animal");
	void sound() {
		System.out.println("Sound method of Animal");
	}
	
	void div(int a ,int b) {
		System.out.println("Divison by a/b - Animal");
	}
}
