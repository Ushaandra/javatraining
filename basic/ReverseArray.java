package com.lumen.basic;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array= {10,20,35,24,12,68};
		for(int i=0;i<(int)(array.length/2);i++) {
			int temp=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
		}
		for(int number:array)
			System.out.print(number+" ");

	}

}
