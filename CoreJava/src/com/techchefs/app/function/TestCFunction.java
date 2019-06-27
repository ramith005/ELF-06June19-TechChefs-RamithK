package com.techchefs.app.function;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class TestCFunction {

	public static void main(String[] args) {
		Function<Integer,Integer> r = a-> a* a;
		
		int res = r.apply(5);
		log.info("Result is"+res);
	}

}
