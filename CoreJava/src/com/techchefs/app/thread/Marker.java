package com.techchefs.app.thread;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable {
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			log.info("Value "+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		}
	}
	
	Runnable x = ()->{
		for(int i=0;i<5;i++) {
			log.info("Value "+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		}
	};
}
