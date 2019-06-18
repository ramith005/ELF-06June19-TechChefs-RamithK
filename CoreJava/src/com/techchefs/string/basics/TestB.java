package com.techchefs.string.basics;

public class TestB {

	public static void main(String[] args) {
		String name = "Dimple";
		int size = name.length();
		System.out.println("The length is "+size);
		
		String b = "Priya";
		System.out.println(" Equals result "+name.equals(b));
		
		String st = "Hi how are you";
		String ar[] = st.split("o");
		
		for(int i=0;i<ar.length;i++) {
			System.out.println("Array elements are "+ar[i]);
		}
		System.out.println();

	}

}
