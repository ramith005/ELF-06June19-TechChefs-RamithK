package com.techchefs.app.predicate;

import java.util.function.Predicate;

public class TestBPredicate {

	public static void main(String[] args) {
		
		Predicate<String> p =a-> a.length() >= 5;
		
		String str = "GoodMorning";
		
		boolean res = p.test(str);
	}

}
