package com.techchefs.assignment.streams;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class StreamArrayList {

	public static void main(String[] args) {

		Student s1 = new Student("mohib", 12, 42, 25.5);
		Student s2 = new Student("anita", 42, 55, 55.5);
		Student s3 = new Student("ankith", 36, 65, 65.5);
		Student s4 = new Student("ramesh", 25, 69, 67.5);
		Student s5 = new Student("harish", 22, 71, 75.5);

		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		Comparator<Student> c = (a, b) -> {
			if (a.age < b.age) {
				return -1;
			} else if (a.age > b.age) {
				return 1;
			} else {
				return 0;
			}
		};

		List<Student> x = al.stream().sorted(c).collect(Collectors.toList());

		for (Student s : x) {
			log.info("" + s);
		}
	}
}
