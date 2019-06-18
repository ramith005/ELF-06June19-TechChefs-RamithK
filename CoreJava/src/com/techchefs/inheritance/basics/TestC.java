package com.techchefs.inheritance.basics;

public class TestC {

	public static void main(String[] args) {
		Father f = new Son();
		f.bike();
		
		Father ft = new Father();
		ft.bike();
	}

}
