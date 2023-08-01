package com.lumen.basic;

public class Factorial {

	public static void main(String[] args) {
		int number=5;
		int factorial=1;
		int i=number;
		while(i>=1) {
			factorial=factorial*i;
			i--;
		}
		System.out.println("Factorial: "+factorial);

	}

}

