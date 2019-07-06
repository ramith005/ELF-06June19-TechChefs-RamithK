package com.techchefs.designpattern;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) {
		MyImmutableClass immutableClass = new MyImmutableClass("Abc asd",16,9986055608L);
		
		log.info("Name "+immutableClass.getName());
		log.info("Age "+immutableClass.getAge());
		log.info("Phone "+immutableClass.getPhone());
	}

}
