package com.techchefs.javaapp.wrapper;

public class Wraper {

	public static void main(String[] args) {
		String x ="40";
		String y = "50";
		
		System.out.println("Add result is :"+x+y);
		
		int i = Integer.parseInt(x);
		int j = Integer.parseInt(y);
		
		System.out.println("Add result is :"+(i+j));
		System.out.println("Add result is :"+(x+i));
		System.out.println("Add result is :"+(y+j));

	}

}
