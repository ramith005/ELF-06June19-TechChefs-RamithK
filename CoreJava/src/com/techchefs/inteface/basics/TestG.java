package com.techchefs.inteface.basics;

public class TestG {

	public static void main(String[] args) {
		ATmMachine ac = new ATmMachine();
		
		ICICI ic = new ICICI();
		HDFC hc = new HDFC();
		SBI sb = new SBI();
		
		ac.checkCardAndProceed(ic);
		System.out.println("**********");
		ac.checkCardAndProceed(hc);
		System.out.println("**********");
		ac.checkCardAndProceed(sb);

	}

}
