package com.techchefs.app.thread;

import lombok.extern.java.Log;

@Log
public class Mouse implements Runnable {
	
	String name;
	
	public Mouse(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		log.info(name +" Started");
		
		for(int i=0; i<5;i++) {
			log.info(name +" Printing "+ i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		log.info(name +" Completed");
	}
	
}
