package com.techchefs.app.function;

import java.util.function.Function;

public class TestBFunction {
	public static void main(String[] args) {
		Function<String,Integer> f = s -> s.length();
		
		int res = f.apply("asdasdas");
		System.out.println("Res "+res);
	}
}
