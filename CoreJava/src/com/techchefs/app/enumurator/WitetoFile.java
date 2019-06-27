package com.techchefs.app.enumurator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

import lombok.extern.java.Log;

@Log
public class WitetoFile {

	public static void main(String[] args) {
		
		FileOutputStream fout = null;
		String msg = "Good morning ";
		byte[] by = msg.getBytes();
		
		try {
			fout = new FileOutputStream("vikas.txt");
			fout.write(by);
		} catch(Exception e) {
			log.info("Exception ");
		}
		
	}

}
