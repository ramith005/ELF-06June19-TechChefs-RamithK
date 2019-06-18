package com.techchefs.inteface.basics;

public class ATmMachine {
	
	void checkCardAndProceed(AtmCard ac) {
		ac.validateCard();
		ac.getCardInfo();
	}
}
