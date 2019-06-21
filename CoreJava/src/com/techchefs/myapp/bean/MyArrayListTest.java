package com.techchefs.myapp.bean;

import java.util.logging.Logger;

public class MyArrayListTest {

	private static final Logger log = Logger.getLogger("mainmethodClass");
	public static void main(String[] args) {
		MyArrayList ac = new MyArrayList(10);
		int size = 12;
		
		//add method
		for(int i=0;i<size;i++) {
			ac.add(i);
		}
		
		//log.info("Removing the 4th element");
		ac.remove(4);
		
		//get method
		for(int i=0;i<size;i++) {
			log.info("get method: "+ac.get(i));
		}
	}
	
	private void addData(int size,MyArrayList ac) {
		//add method
		for(int i=0;i<size;i++) {
			ac.add(i);
		}
	}

	
}
