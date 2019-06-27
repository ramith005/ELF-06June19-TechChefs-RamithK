package com.techchefs.assignment.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PersonalInfoToProFile {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("personal.properties");
			
			Properties p = new Properties();
			p.setProperty("Name","Ramith");
			p.setProperty("Phone","9986055698");
			p.setProperty("Email","ramith005@gmail.com");
			
			try {
				p.store(fout, "Personal Details");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
		
}
