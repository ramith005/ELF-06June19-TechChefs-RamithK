package com.techchefs.array.basics;

public class Chararray {

	public static void main(String[] args) {
		char c[] = new char[6];
		String st[] = new String[2];
		
		c[0] = 'R';
		c[1] = 'A';
		c[2] = 'M';
		c[3] = 'I';
		c[4] = 'T';
		c[5] = 'H';
		
		for(int i=0;i<c.length;i++) {
			System.out.println("a["+i+"] is " +c[i]);
		}
		
		st[0] = "Ramith";
		st[1] = "Mohib";
		
		System.out.println("Array length is "+c.length);
		System.out.println(" ");
		System.out.println("*************");
		System.out.println("Array length is "+st.length);
		
		for(int i=0;i<st.length;i++) {
			System.out.println("a["+i+"] is " +st[i]);
		}

	}

}
