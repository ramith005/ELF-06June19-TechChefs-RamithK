package com.techchefs.app.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestE {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(2);
		al.add(3);
		
		
		Comparator<Integer> c = (i,j) -> i.compareTo(j)*-1;
		
		List<Integer> s = al.stream().sorted(c).collect(Collectors.toList());
		log.info("Sorted List :"+s);
	}

}
