package com.lumen.scan;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range: ");
		int range=sc.nextInt();
		for(int i=1;i<range;i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
		

	}

}
