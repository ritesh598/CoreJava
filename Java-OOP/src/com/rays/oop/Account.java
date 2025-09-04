package com.rays.oop;

public class Account {
	private String number;
	private String accountType;
    private  double balance;
    
    public String getnumber() {
    	return this.number ;
    	
    }
  public void setnumber (String number) {
	  this.number = number;
	  
  }
    public String getaccountType (){
    return this.accountType;
    
}

    public void SetaccountType (String accountType) {
    	this.accountType = accountType;
    	
    	
    }
      public double getbalance () {
      return this.balance;
}
      public void setbalance(double balance) {
    	  this.balance = balance ;
      }
	 
// 	 deposit method
 	 public void deposit (double amount) {
 		 this.balance = this.balance + amount;
 		 System.out.println("total balance after fund transfer:- " + getbalance());
 	 }
 	 
//	 withdrawal method
	 public void withdrawal (double amount) {
		 if (amount > this.balance) {
			 System.out.println("Insufficient fund transfer " + getbalance());
			
		} else {
			this.balance = this.balance -amount;
			System.out.println("Total balance after withdrawal " + getbalance());
		}
	 }
	 //fund transfer method 
	 public void fundTransfer (Account targetaccount,double amount) {
		 if (amount>this.balance) {
			 System.out.println("insufficient balance to transfer");
			 
			
		}else{
			
			//withdrawal from current account 
			this.balance = balance-amount;
			
			//deposit into target account 
			targetaccount.balance = targetaccount.balance ;
			System.out.println("transfer"+ amount+"from"+ this.number +"to" +targetaccount.number);
			System.out.println("you new balance" + this.getbalance());
			System.out.println("recevers new balance" + targetaccount.getbalance());
			
		}
	 }
}

		

	
      
      
      
      
      
      