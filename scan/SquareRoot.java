package com.lumen.scan;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Array size: ");
		int n=scanner.nextInt();
		int [] array1=new int[n];
		int [] array2=new int[n];
		for(int i=0;i<n;i++) {
			array1[i]=scanner.nextInt();
		}
		int i=0;
		for(int number:array1) {
			array2[i]=(int) Math.pow(number, 0.5);
			System.out.print(array2[i]+" ");
			i++;
		}

	}

}
