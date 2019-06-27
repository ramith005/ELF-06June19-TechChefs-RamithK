package com.techchefs.app.doublecolon;

public class TestL {

	public static void main(String[] args) {
		MyBoy mb = Boy :: new;
		
		Boy b = mb.getBoy("Ramith", 183.5, 32);
		
		b.boyDetails();
	}

}
