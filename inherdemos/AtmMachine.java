package com.lumen.inherdemos;

public class AtmMachine {
	double balance;

	public AtmMachine(double balance) {
//		super();
		this.balance = balance;
	}
	void withDraw(double amount) {
		if(balance-amount>0) {
			System.out.println(balance-amount);
			balance-=amount;
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	void deposit(double amount) {
		System.out.println(balance+amount);
		balance+=amount;
	}
	double getBalance() {
		return balance;
	}
	

}
