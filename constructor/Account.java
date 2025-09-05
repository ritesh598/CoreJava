package com.rays.oop.constructor;

public class Account {
	
	public String accountNo;
	public String accounttype;
	public double balance ;
	
	public Account (String account,String accounTtype,double balence) {
		this.accountNo = accountNo;
		this.accounttype = accounttype; 
		this.balance = balance ;
		
	}
	public String getaccountNo () {
		return this.accountNo;
	}
	public String getaccounttype() {
		return this.accounttype;
		
	}
	public double getbalance() {
		return this.balance;
	}
	
//	 deposit method
	 public void deposit (double amount) {
		 this.balance = this.balance + amount;
		 System.out.println("total balance after deposit:- " + getbalance());
	 }
	 
//	 withdrawal method
	 public void withdrawal (double amount) {
		 if (amount > this.balance) {
			 System.out.println("Insufficient fund transfer " + getbalance());
			
		} else {
			this.balance = this.balance - amount;

			System.out.println("Total balance after withdrawal " + getbalance());
		}
		 
			}
	 
//		Fund Transfer
	 public void fundTransfer(Account targetAccount, double amount) {
		if (amount > this.balance) {
			System.out.println("Insuffiecient fund to transfer");
			
		} else {
			this.balance = this.balance - amount;
			targetAccount.balance = targetAccount.balance + amount;
			
			System.out.println("Transferred " + amount + " from " + this.accountNo + " to " + targetAccount.accountNo);
			System.out.println("Your new balance " + this.getbalance());
			System.out.println("Receiver's new balance " + targetAccount.getbalance());

		}
		 


	 }
}

