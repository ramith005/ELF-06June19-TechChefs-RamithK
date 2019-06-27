package com.techchefs.app.predicate;
import java.util.function.Predicate;
import lombok.extern.java.Log;


@Log
public class TestAPredicate {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = a -> a % 2 ==0;
		boolean res = p.test(15);
	
	}
}
