package com.rays.oop.constructor;

public class PersonConstructorCalling {

	public PersonConstructorCalling() {

		System.out.println("person: Default Constructor");

	}

	public PersonConstructorCalling(String name) {
		this();
		System.out.println("Name " + name);

	}
	
	public PersonConstructorCalling(String name, String address) {
		this(name);
		
		System.out.println("address:" + address);
		
	}
	public PersonConstructorCalling(String name , String address, int age) {
		this(name, address);
		
		System.out.println("age:" + age);
	}
	
	

}
