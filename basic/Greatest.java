package com.lumen.basic;

public class Greatest {
	public static void main(String[] args) {
		int[] numbers = {5,10,50,35,2,30,45,-2};
		int greatest_number=numbers[0];
		for(int number : numbers) {
			if(number>greatest_number)
				greatest_number=number;

		}
		System.out.println("Greatest number: "+greatest_number);
	}

}
