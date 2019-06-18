package com.techchefs.contructor.basics;

public class TestC {

	public static void main(String[] args) {
		student s = new student("Ramith",29,84.4);
		student p = new student("Koushik",21,74.4);
		
		p.display();
		System.out.println();
		s.display();
	}

}
