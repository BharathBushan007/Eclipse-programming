package com.java;

import java.util.Random;

public class Array_2DjaggedArray {
	public static void main(String[] args) {
		case_1();
	}

	public static void case_1() {
		int arr[][] = new int[3][];
		arr[0] = new int[4];
		arr[1] = new int[1];
		arr[2] = new int[8];

		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
