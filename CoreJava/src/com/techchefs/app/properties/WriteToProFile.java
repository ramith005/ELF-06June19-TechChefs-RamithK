package com.techchefs.app.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProFile {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("demo.properties");
			
			Properties p = new Properties();
			p.setProperty("Companay","ewewe");
			p.setProperty("Phone","9923412343");
			
			try {
				p.store(fout, "Companay Details");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
