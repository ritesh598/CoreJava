package in.co.rays.basic;

import java.util.Scanner;

 public class TestCalculatorScanner { 
 public static void main(String[] args) {
	 
	var sc = new Scanner  (System.in);
	
	System.out.println("enter first no:" );
	
	int a = sc.nextInt();
	System.out.println("enter sec"+ "ond no:");
	
	int b= sc.nextInt();
	
	System.out.println("enter opr like +, _ , * , / , % ");
	
    String opr= sc.next();
 
    switch ( opr) {
    
    case "+":
	System.out.println("result:" +(a + b) );
	break;
 
     case"-":
	System.out.println("result:" +(a - b) );
	break;
	
     case"*":
	System.out.println("result:" +(a * b) );
	break;
	
    case"/":
	System.out.println("result:" +(a / b) );
	break;
	
    case"%":
	System.out.println("result:" +(a % b) );
	break;
   default:
	break;
}

 }
}
