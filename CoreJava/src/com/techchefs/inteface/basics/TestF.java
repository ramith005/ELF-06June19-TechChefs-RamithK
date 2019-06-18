package com.techchefs.inteface.basics;

public class TestF {

	public static void main(String[] args) {
		Browser b = new Browser();
		Gmail g = new Gmail();
		GDrive gd = new GDrive();

		b.Open(gd);
		b.Open(g);

	}

}
