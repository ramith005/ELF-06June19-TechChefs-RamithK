package com.techchefs.app.doublecolon;

public class TestG {

	static void open() {
		System.out.println("Open method");
		System.out.println("Logic to open ");
	}
	public static void main(String[] args) {
		Rooms r = TestG :: open;
		r.remove();
	}

}
