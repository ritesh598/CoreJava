package com.rays.oop.abstraction;

public class BusinessMan extends Person implements RichMan ,SocialWorker{
	
	 
	@Override
	public void earnmoney() {
		 System.out.println("earn money");
	}

	@Override
	public void donation() {
		System.out.println("give donation");
		
	}

	@Override
	public void party() {
		 System.out.println("doing party");
		
	}

	@Override
	public void helpToother() {

System.out.println("helptoother");
	}
	
	@Override
	public void getName() {
		System.out.println("Ritesh");
			}
	


}
