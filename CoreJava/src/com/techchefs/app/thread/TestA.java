package com.techchefs.app.thread;

import lombok.extern.java.Log;

@Log
public class TestA {

	public static void main(String[] args) {
		log.info("Main started ********");
		Pen p 	= new Pen();
		p.setName("T1 thread");
		p.setPriority(1);
		p.start();
		
		Pen p1 	= new Pen();
		p1.setName("T2 thread");
		p.setPriority(10);
		p1.start();
		
		Pen p2 	= new Pen();
		p2.setName("T3 thread");
		p2.run();
		
		log.info("Main ended ********");
		
	} //end of main
}// end of class Test A
