package com.techchefs.app.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;

@Log
public class TestF {

	public static void main(String[] args) {
		Pencil p1 = new Pencil();
		
		FutureTask<Integer> ft = new FutureTask<Integer>(p1);
		
		Thread t1 = new Thread(ft);
		t1.start();
		
		int i = 0;
		try {
			i = ft.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		log.info("The Value is "+i);
	}

}
