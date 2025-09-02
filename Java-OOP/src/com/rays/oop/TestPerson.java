package com.rays.oop;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Person p = new Person();
		p.setName("Ritesh");
		p.setDob(sdf.parse("12-09-2003"));
		p.setAddress("Indore");

		System.out.println("Name:-" + p.getName());
		System.out.println("Dob:-" + sdf.format(p.getdob()));
		System.out.println("Address:-" + p.getAddress());

		if (p.getAge() >= Person.AVG_AGE) {
			System.out.println(p.getAge() + "you are eligible to vote");

		} else {
			System.out.println(p.getAge() + "you are not eligible to vote");
			System.out.println();
		}

			System.out.println("------------------");

			SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
			Person A = new Person();
			A.setName("Aman");
			A.setDob(sdf1.parse("13-07-2005"));
			A.setAddress("Ashta");
			System.out.println("Name:-" + A.getName());
			System.out.println("Dob:-" + sdf1.format(A.getdob()));
			System.out.println("address:-" + A.getAddress());
			if (A.getAge() >= Person.AVG_AGE) {
				System.out.println(A.getAge() + "you are eligible to vote");

			} else {
				System.out.println(A.getAge() + "you are not eligible to vote ");
				System.out.println(); {

		


				}
			}
	}
}
