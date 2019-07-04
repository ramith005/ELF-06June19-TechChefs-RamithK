package com.techchefs.javaassessment;

/**
 * 
 * @author Ramith
 * 4)	WAP to search a train by name or number
 */
import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class Train {

	private String name;
	private int id;

	void search(String s) {
		log.info("Searching a train by name");
	}

	void search(int id) {
		log.info("Searching a train by number");
	}
}//End of Class
