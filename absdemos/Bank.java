package com.lumen.absdemos;

public abstract class Bank {
	double balance=10000;
	abstract void withdraw(double amount);
	abstract void deposit(double amount);
	double getBalance() {
		return balance;
	}
	

}
