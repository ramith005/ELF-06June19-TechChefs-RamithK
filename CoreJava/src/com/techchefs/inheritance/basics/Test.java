package com.techchefs.inheritance.basics;

public class Test {
	public static void main(String[] args) {
		Scalc s = new Scalc();
		s.add();
		s.sub();
		s.sin();
		s.cos();
		s.tan();
		s.coseq();
		
		Calculator c = new Calculator();
		c.add();
		c.div();
	}
}
