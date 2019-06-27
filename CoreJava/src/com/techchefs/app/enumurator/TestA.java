package com.techchefs.app.enumurator;

import lombok.extern.java.Log;

@Log
public class TestA {

	public static void main(String[] args) {
		
		Gender t = Gender.FEMALE;
		
		switch(t) {
			case MALE:
				log.info("Output "+Gender.MALE);
				break;
				
			case FEMALE:
				log.info("Output "+Gender.FEMALE);
				break;
		}
		
		log.info("Output "+Gender.OTHER);
		log.info("Position "+Gender.FEMALE.ordinal());
	}

}
