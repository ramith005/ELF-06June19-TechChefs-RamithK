package com.techchefs.javaassessment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;
/**
 * 
 * @author Ramith
 * 7)	WAP to find the count of only passed female candidates of the class. (Using Lambda and Stream)
 */
public class StudentTopperTest {
	static Logger log = Logger.getLogger("StudentTopperTest");
	
	static  Comparator<StudentTop> c = (i,j) -> {
		if(i.getPercentage() > j.getPercentage()) {
			return 1;
		} else if(i.getPercentage() < j.getPercentage()) {
			return -1;
		} else {
			return 0;
		}
	};
	
	static StudentTop getTopper(List<StudentTop> maleStud) {
		return maleStud.stream().max(c).get();
	}
			
			
	public static void main(String[] args) {
		
		StudentTop s1 = new StudentTop();
		s1.setId(1);
		s1.setName("Rakesh");
		s1.setGender('M');
		s1.setPercentage(87.23);
		
		StudentTop s2 = new StudentTop();
		s2.setId(2);
		s2.setName("Umesh");
		s2.setGender('M');
		s2.setPercentage(57.34);
		
		StudentTop s3 = new StudentTop();
		s3.setId(3);
		s3.setName("Ramya");
		s3.setGender('F');
		s3.setPercentage(67.43);
		
		StudentTop s4 = new StudentTop();
		s4.setId(4);
		s4.setName("Priya");
		s4.setGender('F');
		s4.setPercentage(78.35);
		
		StudentTop s5 = new StudentTop();
		s5.setId(5);
		s5.setName("Eshwar");
		s5.setGender('M');
		s5.setPercentage(62.45);
		
		StudentTop s6 = new StudentTop();
		s6.setId(5);
		s6.setName("Eshwar");
		s6.setGender('M');
		s6.setPercentage(62.45);
		
		
		ArrayList<StudentTop> al = new ArrayList<StudentTop>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		Predicate<StudentTop> p1 = (s)->{
			if(s.getGender()=='M') {
				return true;
			} else {
				return false;
			}
		};
		
		Predicate<StudentTop> p2 = (s)->{
			if(s.getGender()=='F') {
				return true;
			} else {
				return false;
			}
		};
	
		List<StudentTop> maleStud = al.stream().filter(p1).collect(Collectors.toList());
		
		List<StudentTop> femaleStud = al.stream().filter(p2).collect(Collectors.toList());
		
		StudentTop mtopper = getTopper(maleStud);
		
		StudentTop ftopper = getTopper(femaleStud);
		
		log.info("Topper in Male Student: "+mtopper.getName()+" with percentage "+mtopper.getPercentage());
		
		log.info("Topper in Female Student: "+ftopper.getName()+" with percentage "+ftopper.getPercentage());
		

	}

}
