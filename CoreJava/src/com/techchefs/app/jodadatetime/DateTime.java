package com.techchefs.app.jodadatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import lombok.extern.java.Log;

@Log
public class DateTime {

	public static void main(String[] args) {
		LocalDate a = LocalDate.now();
		
		log.info("Week "+a.getDayOfWeek());
		log.info("Month Value"+a.getDayOfMonth());
		log.info("Year "+a.getYear());
		log.info("Check "+a.isLeapYear());
		log.info("Era  "+a.getEra());
		
		String timestr = "01:29 PM";
		LocalTime time = LocalTime.now(); // gets the current time  
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); 
		DateTimeFormatter formatternew = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
		
		LocalDate blr = LocalDate.of(1947, 8, 15);
		LocalDate cur = LocalDate.now();
		
		Period p = Period.between(blr, cur);
		
		log.info(" Year "+p.getYears());
		log.info(" Months "+p.getMonths());
		
		log.info(" Current time "+time.format(formatter));
		log.info(" Date and time "+now.format(formatternew)); 
		
		LocalDate ld = LocalDate.of(1996, 1, 20);
		LocalDate dead = ld.plusYears(60);
		
		Period p1 = Period.between(ld, dead);
		
		int total = p.getYears()*365 + p.getMonths()*30+p.getDays();
		log.info(" Total number of days to survive is "+total);
	}

}
