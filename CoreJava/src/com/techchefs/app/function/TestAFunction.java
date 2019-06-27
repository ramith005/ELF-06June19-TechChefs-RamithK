package com.techchefs.app.function;

import java.util.function.Function;
import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class TestAFunction {

	public static void main(String[] args) {
		Function<Double,Double> f = r-> 3.14 * r * r;
		double x = f.apply(5.2);
		System.out.println("Area "+x);
	}

}
