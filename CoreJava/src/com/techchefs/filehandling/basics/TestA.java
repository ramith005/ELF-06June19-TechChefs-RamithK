package com.techchefs.filehandling.basics;

import java.io.File;
import java.io.IOException;

public class TestA {

	public static void main(String[] args) {
		
		File f = new File("D:/vikas.txt");
		
		try {
			boolean res = f.createNewFile();
			System.out.println("Result is "+res);
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
