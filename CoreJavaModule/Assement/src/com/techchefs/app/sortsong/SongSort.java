package com.techchefs.app.sortsong;

import java.time.LocalDateTime;

import javax.swing.text.DateFormatter;

import lombok.extern.java.Log;

/**
 * 
 * @author Ramith
 * WAP to sort the songs based on the date and time
 */

@Log
public class SongSort {

	public static void main(String[] args) {
		
		Song s1	= new Song("Song1","11/11/2016");
		Song s2	= new Song("Song2","11/04/2016");
		Song s3	= new Song("Song3","28/02/2016");
		Song s4	= new Song("Song4","29/09/2016");
		
		
		LocalDateTime ld = LocalDateTime.now();
		log.info("Local date time "+ld);
		
		//Comparator<>
	}

}
