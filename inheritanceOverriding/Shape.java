package com.rays.oop.inheritanceOverriding;

public class Shape {
	
	protected  String color  ;
	protected int  BorderWidht ;
	
	public String getcoler () {
	return this.color ;
}
	public void setcoler (String coler) {
		this.color=coler ;
	}
	public int getBorderWidht () {
		return  this.BorderWidht;
		
}
	public void setBorderWidht  ( int borderwidht) {
		 
		this.BorderWidht =borderwidht ;
}
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}

