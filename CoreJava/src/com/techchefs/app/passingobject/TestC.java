package com.techchefs.app.passingobject;

public class TestC {

	public static void main(String[] args) {
		Baby b = new Baby();
		
		Lays r =  new Lays();
		Kerkure k =  new Kerkure();
		Icream ic = new Icream();
		
		b.receive(r);
		b.receive(k);
		System.out.println("***************");
		b.Pass(ic);
	}

}
