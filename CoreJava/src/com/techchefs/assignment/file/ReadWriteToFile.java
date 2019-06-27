package com.techchefs.assignment.file;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class ReadWriteToFile {
	private static final Logger log=Logger.getLogger("ramithlog");

	public static void main(String[] args) {
		String msg="ding ding diganna";
		char ch[]=msg.toCharArray();
		try {
			FileWriter fout=new FileWriter("srcfile.csv",true);
			fout.write(ch);
			fout.flush();
			fout.close();
			log.info("data is written into file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
