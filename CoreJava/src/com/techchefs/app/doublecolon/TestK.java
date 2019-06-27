package com.techchefs.app.doublecolon;

public class TestK {

	public static void main(String[] args) {
		PenFactory pf = Pen :: new;
		Pen x = pf.getPen();
		
		x.write();
	}

}
