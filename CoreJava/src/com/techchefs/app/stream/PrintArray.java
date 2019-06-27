package com.techchefs.app.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class PrintArray {

	public static void main(String[] args) {
		Integer a[]= {5,6,2,7,3,9};
		
		Stream s = Stream.of(a);
		//s.forEach(i->log.info("Value is "+i));
		s.forEach(System.out :: println);
	}

}
