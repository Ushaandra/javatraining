package com.lumen.basic;

public class SecondGreatest {

	public static void main(String[] args) {
		int[] array= {10,20,30,40,45,35,24,27,35};
		int firstgreatest=-999999;
		int secondgreatest=-999999;
		for(int number:array) {
			if(number>firstgreatest) {
				secondgreatest=firstgreatest;
				firstgreatest=number;
			}
			else if(number<firstgreatest && number>secondgreatest)
				secondgreatest=number;
		}
		
		System.out.println("Second greatest number: "+secondgreatest);

	}

}
