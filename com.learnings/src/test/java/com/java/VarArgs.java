package com.java;

public class VarArgs {
	public static void main(String[] args) {
		add(12, 3, 4);
	}

	public static void add(int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}
