package com.lumen.inherdemos;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter savings or current account:");
		String accountType=sc.next();
		
		System.out.println("enter balance:");
		double balance=sc.nextDouble();
		
		System.out.println("Withdraw or deposit:");
		String type=sc.next();
		
		System.out.println("Amount: ");
		double amount=sc.nextInt();
		
		AtmMachine savings=new AccountSavings(balance);
		AtmMachine current=new Current(balance);
		if(accountType.equalsIgnoreCase("savings")) {
			if(type.equalsIgnoreCase("withdraw")) {
				savings.withDraw(amount);
			}
			else if(type.equalsIgnoreCase("deposit")) {
				savings.deposit(amount);
			}
			System.out.println("Balance "+savings.getBalance()); 
		}
		else if(accountType.equalsIgnoreCase("current")) {
			if(type.equalsIgnoreCase("withdraw")) {
				current.withDraw(amount);
			}
			else if(type.equalsIgnoreCase("deposit")) {
				current.deposit(amount);
			}
			System.out.println("Balance "+current.getBalance()); 
		}
		
	}

}
