package com.techchefs.javaassessment;

import lombok.extern.java.Log;

@Log
public class HDFCBankCard implements BankCard {

	public void bankName() {
		log.info("HDFC Bank");
	}
}
