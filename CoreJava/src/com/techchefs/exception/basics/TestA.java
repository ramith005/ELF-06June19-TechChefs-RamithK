package com.techchefs.exception.basics;

public class TestA {

	public static void main(String[] args) {
		System.out.println("Main method Start");
		
		IRCTC ir = new IRCTC();
		Paytm p = new Paytm();
		
		p.sendData(ir);
		p.callFile(ir);
		
		System.out.println("Main method end");
	}

}
