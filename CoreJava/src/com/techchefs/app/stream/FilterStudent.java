package com.techchefs.app.stream;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class FilterStudent {

	static Comparator<StudentTest> c = (a,b) ->{
		if(a.getPercentage() > b.getPercentage()) {
			return 1;
		} else if(a.getPercentage() < b.getPercentage()) {
			return -1;
		} else {
			return 0;
		}
	};
	
	static StudentTest getTopper(ArrayList<StudentTest> al) {
		
		return al.stream().max(c).get();
	}
	
	static StudentTest getLesser(ArrayList<StudentTest> al) {
		
		return al.stream().min(c).get();
	}
	
	public static void main(String[] args) {

		StudentTest s1 = new StudentTest(1,"Ramith",45.5);
		StudentTest s2 = new StudentTest(1,"Mohib",55.5);
		StudentTest s3 = new StudentTest(1,"Ashutosh",64.5);
		StudentTest s4 = new StudentTest(1,"Santosh",75.8);
		StudentTest s5 = new StudentTest(1,"Deekshit",69.5);
		
		ArrayList<StudentTest> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		StudentTest s = getTopper(al);
		log.info("The topper is "+s.getName()+" with the percetntage "+s.getPercentage());
		
		StudentTest st = getLesser(al);
		log.info("The Lowest is "+st.getName()+" with the percetntage "+st.getPercentage());
	}
}
