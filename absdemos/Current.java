package com.lumen.absdemos;

public class Current extends Bank {
//	double amount;
	

	@Override
	void withdraw(double amount) {
		System.out.println("Current withdraw: "+(balance-amount-50));
		balance=balance-amount-50;
	}


	@Override
	void deposit(double amount) {
		System.out.println("Current deposit: "+(balance+amount+50));
		balance=balance+amount+50;
	}
	

}
