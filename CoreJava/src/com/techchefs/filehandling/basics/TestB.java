package com.techchefs.filehandling.basics;

import java.io.File;
import java.io.IOException;

public class TestB {
public static void main(String[] args) {
		
		File f = new File("D:/programfiles/movies/new");
		boolean res = f.mkdirs();
		
		System.out.println("Rest is "+res);
		System.out.println("File is created at : " + f.getAbsolutePath());

	}
}
