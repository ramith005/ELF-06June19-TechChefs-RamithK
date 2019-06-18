package com.techchefs.app.jspiders;

public class TestCard {

	public static void main(String[] args) {
		Card j = new Card();
		Card a = new Card();
		
		j.swipe();
		a.swipe();
		a.swipe();
		
		System.out.println("The Oganization count is "+Card.orgcount);
		System.out.println("The Java Count is "+j.count);
		System.out.println("the angular count is "+a.count);

	}

}
