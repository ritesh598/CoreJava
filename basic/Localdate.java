package in.co.rays.basic;

import java.time.LocalDate;


public class Localdate {
public static void main(String[] args) {
	
	LocalDate date = LocalDate.now ();
	System.out.println(date);
	
	
	LocalDate dob = LocalDate.of( 2003,9,12 );
	System.out.println(dob);
	System.out.println("----------");
	 System.out.println("datr:" + date);
	 System.out.println("day of month:" + dob.getDayOfMonth());
	 System.out.println("day od week:" + dob.getDayOfWeek());
	System.out.println("day of year:" + dob.getDayOfYear());
	
	System.out.println("-----------");
	 
	 
	
}
 
}
 

 
