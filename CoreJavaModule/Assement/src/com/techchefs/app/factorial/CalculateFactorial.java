package com.techchefs.app.factorial;


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
	
	public int lambdaFact(int x) {
		/* 
		 * (x)->{
		 * 	  for(int i=1;i<=x;i++) {
		 * 		fact = fact * i;
		 * 	  }
		 * };
		 * /*
		 * 
		 * }
		 * 
		 * */
		//
		
		
		return fact;
	}
}
