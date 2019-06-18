package com.techchefs.filehandling.basics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class TestE {
public static void main(String[] args) {
		
		
		String msg = " write this file into a file";
		char[] c = msg.toCharArray();
		
		try {
			FileWriter fout = new FileWriter("test.txt");
			fout.write(c);
			fout.flush();
			
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
