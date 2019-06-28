package com.techchefs.app.factorial;
/**
 * 
 * @author Ramith
 * WAP to calculate factorial using lambda expression
 */
import lombok.extern.java.Log;

@Log
public class FactCalulation {

	public static void main(String[] args) {
		CalculateFactorial cf = new CalculateFactorial();
		
		
		log.info("Fact Without Lambda  "+cf.calculateFact(5));
		
	}

}
