package com.techchefs.app.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestE {

	public static void main(String[] args) {
		Mouse m1 = new Mouse("Thread 1");
		Mouse m2 = new Mouse("Thread 2");
		Mouse m3 = new Mouse("Thread 3");
		Mouse m4 = new Mouse("Thread 4");
		Mouse m5 = new Mouse("Thread 5");
		Mouse m6 = new Mouse("Thread 6");
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);
		service.execute(m6);
		
		service.shutdown();
		
		
	}

}
