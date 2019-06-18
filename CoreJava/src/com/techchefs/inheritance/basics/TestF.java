package com.techchefs.inheritance.basics;

public class TestF {

	public static void main(String[] args) {
		Car c = new Car();
		LevelOne lo = new LevelOne();
		LevelTwo lt =  new LevelTwo();
		LevelThree th = new LevelThree();
		
		c.speed();
		lo.speed();
		lt.speed();
		th.speed();
	}

}
