package com.techchefs.app.thread;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {
	
	public void run() {
		String s = getName();
		log.info("Thread name ::"+s);
		
		for(int i=0; i<=5; i++) {
			log.info("Values ::"+i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}// end of class Pen
