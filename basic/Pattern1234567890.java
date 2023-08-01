package com.lumen.basic;

public class Pattern1234567890 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=5;
		int count=1;
		for(int i=1;i<=range;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

}
