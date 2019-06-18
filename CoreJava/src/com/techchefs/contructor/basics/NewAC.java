package com.techchefs.contructor.basics;

public class NewAC {
	NewAC(){
		System.out.println("userdefined constructor");
	}
	NewAC(int a){
		System.out.println("constructor with int called");
	}
	
	NewAC(double b){
		System.out.println("constructor with double called");
	}
	
	NewAC(int a,int b){
		System.out.println("constructor with 2 int parameters called");
	}
}
