package com.techchefs.app.predicate;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class TestDPredicate {

	public static void main(String[] args) {
		Predicate<Integer> p = a-> a > 4;
		
		int [] b = {2,5,3,6,4,3};
		
		for(int i=0;i<b.length; i++) {
			if(p.test(b[i])){
				log.info(" "+b[i]);
			}
		}
	}

}
