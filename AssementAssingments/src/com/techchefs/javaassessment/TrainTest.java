package com.techchefs.javaassessment;
/**
 * 
 * @author Ramith
 * 4)	WAP to search a train by name or number
 */
public class TrainTest {
	public static void main(String[] args) {
		Train t = new Train();
		t.search(12345);
		t.search("Gitanjali Express");
	}

}//End of Class
