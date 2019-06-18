package com.techchefs.exception.basics;

public class Paytm extends IRCTC {
	void sendData(IRCTC ir) {
		System.out.println("Send data method");
		ir.process();
	}
	
	void callFile(IRCTC ir) {
		System.out.println("Call File Method Start");
		try {
			ir.writeTofile();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Call File Method End");
	}
}
