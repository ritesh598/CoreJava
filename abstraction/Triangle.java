package com.rays.oop.abstraction;

public class Triangle extends Shape {

	private int base ; 
	private int height ;
	
	public int getbase () {
	
	return this.base; 
	}
	
	public void setbase(int base) {
	
this.base= base ;
}
	public int getheight () {
		return this.height ;
	}
	public void setheight(int height) {
	
	 this.height = height ;
}	
	@Override
public double area () {
	double area = (base *height )/2.0 ;
	return area;
	
	}
	
}
