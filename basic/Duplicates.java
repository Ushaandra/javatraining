package com.lumen.basic;

import java.util.Arrays;

public class Duplicates {

	public static void main(String[] args) {
		int[] array= {10,20,30,45,35,7,23,27,35};
		Arrays.sort(array);
		int flag=0;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]==array[i+1]) {
				flag=1;
				System.out.println("Duplicate: "+array[i]);
				break;
			}
		}
		if(flag==0)
			System.out.println("No duplicates");
	}

}
