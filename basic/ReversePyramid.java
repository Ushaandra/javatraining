package com.lumen.basic;

public class ReversePyramid {

	public static void main(String[] args) {
		int lines = 5;
		for(int i=lines;i>0;i--) {
			for(int j=i;j>0;j--)
			System.out.print('*');
			System.out.println();
		}

	}

}
