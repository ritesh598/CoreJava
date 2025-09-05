package com.rays.oop.constructor;

import java.util.Date;

public class Person {
	
	private String name;
	private String address;
	private Date dob;

	public Person(String name, String address, Date dob) {
		this.name = name;
		this.address = address;
		this.dob = dob;

	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public Date getDob() {
		return this.dob;
	}
}

