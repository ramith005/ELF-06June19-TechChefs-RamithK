package com.techchefs.filehandling.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestF {

	public static void main(String[] args) {
		try {
			FileInputStream fn = new FileInputStream("test.txt");
			int i = fn.read();
			
			while((i=fn.read()) != -1) {
				System.out.print((char)i);
				System.out.println("This file is present in ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
