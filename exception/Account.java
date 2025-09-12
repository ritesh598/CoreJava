package com.rays.oop.exception;

public class Account {
	
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdrawal(double amount) throws FundTransferException {
		if (amount > this.balance) {

			throw new FundTransferException("insuff fund transfer");

		} else {
			this.balance = this.balance - amount;

			System.out.println("Total balance after withdrawal ");
		}

	}

}

