package com.lumen.basic;

public class Armstrong {

	public static void main(String[] args) {
		int number=371;
		int armstrong=0;
		String tempString=Integer.toString(number);
		int power=tempString.length();
		//System.out.println(power);
		int temp=number;
		while(temp>0) {
			armstrong=armstrong+(int)Math.pow(temp%10,power);
			temp=temp/10;
		}
		if(armstrong==number)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an armstrong number");

	}

}
