package com.techchefs.exception.basics;
import java.io.File;
import java.io.IOException;

public class IRCTC {
	void process() {
		System.out.println("Process the data");
		String a = null;
		try {
			System.out.println(10/0);
			System.out.println(a.length());
		}
		catch(ArithmeticException ae) {
			System.out.println("Arthematic Exception ..!");
		}
		catch (NullPointerException np) {
			System.out.println("Null pointer Exception");
		}
		catch(Exception e) {
			System.out.println("Exception catch here.");
		}
	}
	
	void writeTofile() throws IOException {
		try {
			File f = new File("k:/test.txt");
			f.createNewFile();
		}catch(IOException ie) {
			System.out.println("File Exception");
			throw ie;
		}
	}
}
