package com.techchefs.contructor.basics;

public class Gun {
	int bullets;
	
	Gun(int bullets){
		System.out.println("The Gun is loaded with "+bullets+" bullets");
	}
	
	public static void main(String[] args) {
		new Gun(100);
	}
}
