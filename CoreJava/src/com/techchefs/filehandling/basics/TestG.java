package com.techchefs.filehandling.basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestG {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fr);
			
			int i = fr.read();
			
			while((i=fr.read()) != -1) {
				System.out.print((char)i);
				//System.out.println("This file is present in ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
