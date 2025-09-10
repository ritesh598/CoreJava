package com.rays.oop.abstraction;

public class TestBusinessMan {
	
	public static void main(String[] args) {
		
		RichMan r = new BusinessMan();
		
		r.donation();
		r.earnmoney();
		r.party();
		
		BusinessMan bs = new BusinessMan () ; 
		
		SocialWorker s = new BusinessMan ();
		s.helpToother();
		
		Person p = new BusinessMan();
		p.getName();
		
		
		
		
		
		
	}

}
