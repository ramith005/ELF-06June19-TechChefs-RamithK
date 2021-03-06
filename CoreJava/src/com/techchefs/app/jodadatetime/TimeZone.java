package com.techchefs.app.jodadatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.java.Log;

@Log
public class TimeZone {

	public static void main(String[] args) {
		ZoneId z = ZoneId.systemDefault();
		
		ZoneId t = ZoneId.of("Australia/Sydney");
		ZonedDateTime ze = ZonedDateTime.now(t);
		log.info("Current Aus time "+ze.toLocalTime());
	}

}
