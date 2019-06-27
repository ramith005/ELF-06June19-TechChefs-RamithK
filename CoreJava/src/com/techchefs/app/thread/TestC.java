package com.techchefs.app.thread;

public class TestC {

	public static void main(String[] args) {
		PVR p = new PVR();
		
		Browser b = new Browser(p);
		b.start();
		
		Browser b1 = new Browser(p);
		b1.start();
		
		Browser b2 = new Browser(p);
		b2.start();
	}

}
