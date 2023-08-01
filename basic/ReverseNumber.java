package com.lumen.basic;

public class ReverseNumber {

	public static void main(String[] args) {
		int number=367;
		int number1=0;
		while(number>0) {
			int temp=number%10;
			number1=number1*10+temp;
			number=number/10;	
		}
		System.out.println("Reversed number: "+number1);
	}

}
