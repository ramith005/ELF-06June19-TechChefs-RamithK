package com.techchefs.app.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(2);
		al.add(3);
		
		List<Integer> x = al.stream().filter(i -> i % 3==0).collect(Collectors.toList());
		log.info("output :"+x);
	}

}
