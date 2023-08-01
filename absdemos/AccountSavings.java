package com.lumen.absdemos;

public class AccountSavings extends Bank {
//	double amount;

	@Override
	void withdraw(double amount) {
		System.out.println("Savings withdraw: "+(balance-amount-100));
		balance=balance-amount-100;
	}

	@Override
	void deposit(double amount) {
		System.out.println("Savings deposit: "+(balance+amount+100));
		balance=balance+amount+100;
	}

	

}
