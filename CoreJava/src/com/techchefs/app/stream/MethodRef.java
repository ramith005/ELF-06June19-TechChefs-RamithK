package com.techchefs.app.stream;

import lombok.extern.java.Log;

public class MethodRef {
	
	//@Log
	public static void main(String[] args) {
		
		Demo a = x->System.out.println(x);
		a.print(5);
		
		Pen p 	= 	new Pen();
		Demo b 	=	p :: write;
		b.print(10);
	}

}
