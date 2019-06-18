package com.techchefs.app.passingobject;

public class Baby {
	void receive(Snaks s) {
		System.out.println("Receive method of Baby");
		s.open();
		s.eat();
	}
	
	void Pass(Icream ic) {
		ic.passIceCream();
	}
}
