package com.rays.oop.constructor;


public class Student extends PersonConstructorCalling {
	
	public Student() {
		System.out.println("student default constructor");
		
	}
	public Student(String name, String address ,int age, int rollno) {
		super(name, address, age);
		System.out.println("rollnumber:" + rollno);
		
	}
	

	
	}
	
