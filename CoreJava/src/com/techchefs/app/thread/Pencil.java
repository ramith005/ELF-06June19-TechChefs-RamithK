package com.techchefs.app.thread;

import java.util.concurrent.Callable;

public class Pencil implements Callable<Integer> {
	
	public Integer call() {
		int num = 120;
		
		return num;
	}
}
