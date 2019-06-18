package com.techchefs.filehandling.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestC {

	public static void main(String[] args) {
		
		File f = new File("D:/programfiles/movies/new/test.txt");
		
		String msg = "Hi all good evening";
		byte b[] = msg.getBytes();
		
		try {
			FileOutputStream fout = new FileOutputStream("myfile.txt");
			fout.write(b);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
