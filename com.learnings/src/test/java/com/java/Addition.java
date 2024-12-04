package com.java;

public class Addition {

	public static void main(String[] args) {
		Addition add = new Addition();
		add.add(3, 4);
		add.add(3, 5, 7);
	}

	public void add(int a, int b) {
		int i = a + b;
		System.out.println(i);
	}
	
	public void add(int a, int b, int c) {
		int i = a + b + c;
		System.out.println(i);
	}

}
