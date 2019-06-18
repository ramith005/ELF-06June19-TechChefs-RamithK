package com.techchefs.contructor.basics;

public class Cool {
	public static void main(String[] args) {
		B k = new B();
		k.m();
	}
}

class B extends Testing{
	int i = 60;
	
	void m()
	{
		int i = 30;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}

class Testing
{
	int i = 90;
}