package com.techchefs.javaassessment;

import lombok.extern.java.Log;

@Log
public class ThreadsCreation implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				log.info("" + e);
			}
			log.info("" + i);
		}
	}

}
