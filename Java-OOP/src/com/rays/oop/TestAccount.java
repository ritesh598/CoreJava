  package com.rays.oop;

public class TestAccount {
	public static void main(String[] args) {
		Account Ritesh = new Account();

		Ritesh.setnumber("757886544344");
		Ritesh.SetaccountType("Current");
		Ritesh.setbalance(5000.00);
		
		System.out.println(Ritesh.getnumber());
		System.out.println(Ritesh.getaccountType());
		System.out.println(Ritesh.getbalance());
		Ritesh.deposit(1000);
        Ritesh.withdrawal(3000);
        System.out.println();
		
		System.out.println("--------------");
		
		Account Ram = new Account();
		
		Ram.setnumber( "4546464646");
		Ram.SetaccountType( "current");
		Ram.setbalance( 10000.00);
		
		System.out.println(Ram.getnumber());
		System.out.println(Ram.getaccountType());
        System.out.println(Ram.getbalance());
        System.out.println("----------------");
    			  
        Ram.deposit(2000.00);
        Ram.withdrawal(10000.00);
        System.out.println(); 
	}
}