package com.techchefs.app.implementinglamda;
import lombok.extern.java.Log;

@Log
public class RunnableDemo {
	
	public static void main(String[] args) {
		
		Runnable x = ()->{
			for(int i=0;i<5;i++) {
				log.info("Value "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		};
		
		Thread t1= new Thread(x);
		t1.start();
		
		Thread t2= new Thread(x);
		t2.start();
	}
	
}
