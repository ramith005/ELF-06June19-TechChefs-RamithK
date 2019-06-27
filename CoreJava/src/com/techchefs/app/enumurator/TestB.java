package com.techchefs.app.enumurator;

import lombok.extern.java.Log;

@Log
public class TestB {

	public static void main(String[] args) {
		Loan l = Loan.HOME;
		log.info("the value is "+l.getValue());
		
		String s = "Cow";
		
		switch(s) {
			case "Cow":
					log.info("Cow Passed");
					break;
		}
	}

}
