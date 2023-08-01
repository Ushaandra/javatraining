package com.lumen.basic;

public class SecondSmallest {
	public static void main(String[] args) {
		int[] array= {10,20,30,40,45,35,24,27,35};
		int firstsmallest=999999;
		int secondsmallest=999999;
		for(int number:array) {
			if(number<firstsmallest) {
				secondsmallest=firstsmallest;
				firstsmallest=number;
			}
			else if(number>firstsmallest && number<secondsmallest)
				secondsmallest=number;
		}
		
		System.out.println("Second smallest number: "+secondsmallest);
	}

}
