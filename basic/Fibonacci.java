package com.lumen.basic;

public class Fibonacci {

	public static void main(String[] args) {
		int count=10;
		int first=0;
		int second =1;
		int sequence =1;
		for(int i=1;i<= count ;i++) {
			System.out.print(sequence+" ");
			sequence = first+second;
			first = second;
			second = sequence;
		}
	}

}
