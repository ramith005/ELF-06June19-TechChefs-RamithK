package com.techchefs.assignment.pattern;

public class Pattern3 {

	public static void main(String[] args) {
		int rows = 6;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= rows - 1; i++) {
			for (int j = rows - 1; j >= i; j--) {
				System.out.print("*");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}

			System.out.println();
		}

	}

}
