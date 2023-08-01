package com.lumen.inherdemos;

public class AccountSavings extends AtmMachine {

	public AccountSavings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withDraw(double amount) {
		System.out.println("Savings withdraw: "+(balance-amount-100));
		balance=balance-amount-100;
	}

	@Override
	void deposit(double amount) {
		System.out.println("Savings deposit: "+(balance+amount+100));
		balance=balance+amount+100;
	}

}
