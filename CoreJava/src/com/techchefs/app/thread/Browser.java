package com.techchefs.app.thread;

public class Browser extends Thread {
	PVR ref;
	
	Browser(PVR ref){
		this.ref =  ref;
	}
	
	public void run() {
		ref.book();
	}
	
}
