package com.techchefs.javaassessment;


import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class CalculateFactorial {
	
	private int i;
	private int fact=1;
	
	//Constructor
	public CalculateFactorial() {
		
	}
	
	/**
	 * Function to calculate factorial without lambda
	 * @param val
	 * @return int
	 */
	public int calculateFact(int val) {
		for(int i=1;i<=val;i++) {
			fact = fact * i;
		}
		
		return fact;
	}
	
	/**
	 * Function to calculate factorial with lambda
	 * @param x
	 * @return int
	 */
	public int lambdaFact(int x) {
		
		Function<Integer,Integer> f = (n) -> {
            for (int i = 1; i <= n; i++)
            fact = i * fact;
            return fact;
        };
		
		return fact;
	}
}
