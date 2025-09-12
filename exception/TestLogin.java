package com.rays.oop.exception;

public class TestLogin {
	
	public static void main(String[] args)throws Exception {
		
		String Loginid = "Ram@gmail.com";
		
		if ( Loginid != null && Loginid == "Ram@gmail.com") {
			
			System.out.println("user login successfull ");
			
		}else {
			throw new LoginException ("invalid login id")	;		
		}
		
	}

}
