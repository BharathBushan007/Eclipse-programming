package com.java;

import java.util.Random;

public class Array_2D {
	public static void main(String[] args) {
		case_1();
	}

	public static void case_1() {
		int arr[][] = new int[3][2];
		// System.out.println(arr[0].length);
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(40);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
