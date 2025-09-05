package com.rays.oop.constructor;

	import java.text.ParseException;
	import java.text.SimpleDateFormat;

	public class TestPerson {
		public static void main(String[] args) throws ParseException {
			
			SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy");
			Person P = new Person("Ritesh", "Indore", sdf.parse("12-09-2003"));
			 
			System.out.println("NAME: " + P.getName());
			System.out.println("ADDRESS " + P.getAddress());
			System.out.println("DOB " + sdf.format(P.getDob()));
		
			
			System.out.println("--------------");
			
			Person P1 = new Person("Ram", "Indore", sdf.parse("02-05-2000"));
			 
			System.out.println("NAME: " + P1.getName());
			System.out.println("ADDRESS " + P1.getAddress());
			System.out.println("DOB " + sdf.format(P1.getDob()));

		}
	}


