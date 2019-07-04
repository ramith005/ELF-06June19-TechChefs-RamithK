package com.techchefs.javaassessment;

import lombok.extern.java.Log;

@Log
public class ImmutableTest {

	public static void main(String[] args) {

		ImmutableClassCreation imc = new ImmutableClassCreation(29, "Ramith");
		log.info("" + imc.getAge());
		log.info("" + imc.getName());
	}
}
