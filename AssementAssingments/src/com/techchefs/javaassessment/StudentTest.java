package com.techchefs.javaassessment;

/**
 * 
 * @author Ramith
 * 6)	WAP to find the female and male topper of the class. (Using Lambda and Stream)
 */
import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class StudentTest {

	static Comparator<StudentNew> c = (i, j) -> {
		if (i.gender == j.gender)
			if (i.percentage > j.percentage) {
				return 1;
			} else if (i.percentage < j.percentage) {
				return -1;
			}

		return 0;
	};
	static TreeSet<StudentNew> ts = new TreeSet<StudentNew>(c);

	static void getTopper(StudentNew s) {
		if (s.gender.equalsIgnoreCase("Male")) {
			log.info("Male topper is " + ts.stream().max(c));
		}
		
	}

	public static void main(String[] args) {

		StudentNew s1 = new StudentNew("Ashutosh", "Male", 88);
		StudentNew s2 = new StudentNew("Punam", "Female", 78);
		StudentNew s3 = new StudentNew("Kavita", "Female", 68);
		StudentNew s4 = new StudentNew("Prakash", "Male", 58);
		StudentNew s5 = new StudentNew("Sonam", "Female", 89);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);

		for (StudentNew s : ts) {
			StudentTest.getTopper(s);
			break;
			
		}

	}

}
