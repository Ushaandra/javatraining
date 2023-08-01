package com.lumen.basic;

public class Smallest {
	public static void main(String[] args) {
		int[] array= {10,20,30,15,25,5,22};
		int smallest=array[0];
		for(int number:array) {
			if(number<smallest)
				smallest=number;
		}
		System.out.println("Smallest number: "+smallest);
	}

}
