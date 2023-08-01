package com.lumen.basic;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=11;
		int flag=0;
		if(number==0 || number==1)
			System.out.println("Not a prime");
		else if(number==2)
			System.out.println("Prime number");
		else if(number<0)
			System.out.println("Enter positive number");
		else {
			for(int i=2;i<(int)number/2;i++) {
			if(number%2==0) {
				flag=1;
				System.out.println("Not a prime");
				break;
			}	
			}
			if(flag==0)
				System.out.println("Prime");
			

		}
		
	}

}
