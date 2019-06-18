package com.techchefs.bean.basics;

public class TestA {

	public static void main(String[] args) {
		Person a = new Person();
		DB1 d = new DB1();
		DB2 e = new DB2();
		
		a.setName("Ramith");
		a.setAge(29);
		
		d.receive(a);
		System.out.println("***********");
		e.receive(a);

	}

}
