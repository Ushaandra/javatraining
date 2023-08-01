package com.lumen.basic;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,20,30,35,27,40};
		int sum=0;
		for(int i:array)
			sum+=i;
		System.out.println("Sum: "+sum);
		double average=sum/array.length;
		System.out.println("Average: "+average);

	}

}
