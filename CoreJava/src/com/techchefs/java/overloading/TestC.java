package com.techchefs.java.overloading;

public class TestC {

	public static void main(String[] args) {
		
		MIPhone mi = new MIPhone();
		IPhone ip = new IPhone();
		
		Girl g = new Girl();
		g.receive(mi);
		
		g.receive(ip);

	}

}
