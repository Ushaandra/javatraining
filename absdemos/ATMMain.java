package com.lumen.absdemos;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter savings or current account:");
		String accountType=sc.next();
		
//		System.out.println("enter balance:");
//		double balance=sc.nextDouble();
		
		System.out.println("Withdraw or deposit:");
		String type=sc.next();
		
		System.out.println("Amount: ");
		double amount=sc.nextInt();
		
		Bank savings=new AccountSavings();
		//Bank current=new Current();
		if(accountType.equalsIgnoreCase("savings")) {
			if(type.equalsIgnoreCase("withdraw")) {
				savings.withdraw(amount);
			}
			else if(type.equalsIgnoreCase("deposit")) {
				savings.deposit(amount);
			}
			System.out.println("Balance "+savings.getBalance()); 
		}
		else if(accountType.equalsIgnoreCase("current")) {
			savings=new Current();
			if(type.equalsIgnoreCase("withdraw")) {
				savings.withdraw(amount);
			}
			else if(type.equalsIgnoreCase("deposit")) {
				savings.deposit(amount);
			}
			System.out.println("Balance "+savings.getBalance()); 
		}
		
	}

}
