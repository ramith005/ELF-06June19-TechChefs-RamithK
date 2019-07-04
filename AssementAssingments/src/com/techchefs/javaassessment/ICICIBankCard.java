package com.techchefs.javaassessment;

import lombok.extern.java.Log;

@Log
public class ICICIBankCard implements BankCard {

	public void bankName() {
		log.info("ICICI Bank");
	}
}
