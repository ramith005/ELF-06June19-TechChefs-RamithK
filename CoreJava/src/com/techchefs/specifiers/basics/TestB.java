package com.techchefs.specifiers.basics;
import java.util.Scanner;

public class TestB {

	public static void main(String[] args) {
		
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name =  sc.nextLine();
		
		College.s.name =name;
		College.s.Play();
		sc.close();
	}

}
