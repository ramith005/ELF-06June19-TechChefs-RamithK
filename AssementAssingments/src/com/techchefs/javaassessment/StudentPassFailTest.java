package com.techchefs.javaassessment;
/*17)	WAP to return true of students is passed else false, using lambda expression*/
import java.util.function.Predicate;

import lombok.extern.java.Log;
/**
 * 
 * @author Ramith
 * WAP to return true of students is passed else false, using lambda expression
 */
@Log
public class StudentPassFailTest {

	public static void main(String[] args) {
		Student s = new Student(2, "John", 30.00);

		Predicate<Student> p = st -> st.getPercentage() > 35;
		boolean res = p.test(s);
		if (res) {
			log.info(s.getName() + " is pass");
		} else {
			log.info(s.getName() + " is Failed");
		}
	}
}
