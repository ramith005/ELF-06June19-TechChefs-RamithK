package com.techchefs.fileapp.readobject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestB {
public static void main(String[] args) {
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try {
			/*FileOutputStream fout = new FileOutputStream("vikas.try");
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			
			Person p = new Person();
			p.setName("Ramith");
			p.setAge(29);*/
			
			fin = new FileInputStream("vikas.try");
			oin = new ObjectInputStream(fin);
			
			Person p = (Person)oin.readObject();
			System.out.println("Name  is "+p.getName());
			System.out.println("Age  is "+p.getAge());
			oin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(oin != null) {
				try {
					oin.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
