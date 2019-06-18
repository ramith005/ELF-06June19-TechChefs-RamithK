package com.techchefs.inheritance.basics;

public class MarkerPen {

	public static void main(String[] args) {
		Pen p = new Marker();
		System.out.println("Thos pen cost is "+p.cost);
		p.write();
		//p.color(); using the parent type object the child method cannot be accessed
	}

}
