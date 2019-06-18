package com.techchefs.app.passingobject;

public class Friend {
	
	Friend(){
		System.out.println("Dont Pass the Gift");
	}
	Friend(Gift g){
		if(g instanceof Gift) {
			System.out.println("Pass the Gift");
		}
	}
}
