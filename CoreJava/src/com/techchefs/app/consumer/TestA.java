package com.techchefs.app.consumer;

import java.util.function.Consumer;

import lombok.extern.java.Log;

@Log
public class TestA {

	public static void main(String[] args) {
		Student s1 = new Student("Chuinnu" , 22 , 19 , 16);
		
		Consumer<Student> c = s -> {
			double avg = (s.m1+s.m2+s.m3)/3.0;
			log.info("Average is "+avg);
		};
		
		c.accept(s1);
	}

}
