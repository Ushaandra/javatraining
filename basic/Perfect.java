package com.lumen.basic;

public class Perfect {
	public static void main(String[] args) {
		int number=6;
		int perfect=0;
		for(int i=1;i<number;i++) {
			if(number%i==0)
				perfect+=i;
		}
		if(perfect==number)
			System.out.println("perfect number");
		else
			System.out.println("not a perfect number");
	}

}
