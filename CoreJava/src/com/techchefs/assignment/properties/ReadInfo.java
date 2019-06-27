package com.techchefs.assignment.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class ReadInfo {

	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("personal.properties");
			Properties pro =  new Properties();
			pro.load(fin);
			
			log.info("Phone is "+pro.getProperty("Phone"));
			log.info("Email is "+pro.getProperty("Email"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
