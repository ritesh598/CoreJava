package com.rays.oop.constructor;

public class TestAccount {
	
public static void main(String[] args) {
		
		Account a1 = new Account("89898989", "saving", 5000.23);
		System.out.println("AccNo: " + a1.getaccountNo());
		System.out.println("AccType: " + a1.getaccounttype());
		System.out.println("Balance: " + a1.getbalance());
		a1.deposit(500);
		a1.withdrawal(500);
		
		System.out.println("---------------");
		 
		Account a2 = new Account("56565656", "current", 10000.23);
		System.out.println("AccNo: " + a2.getaccountNo());
		System.out.println("AccType: " + a2.getaccounttype());
		System.out.println("Balance: " + a2.getbalance());
		a2.deposit(1000);
		a2.withdrawal(500);
		System.out.println("--------------");
		
		a1.fundTransfer(a2, 500);
		
	}
	

}

