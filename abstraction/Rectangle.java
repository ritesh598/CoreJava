package com.rays.oop.abstraction;

public class Rectangle extends Shape{
	
	public int length ;
	public int width ;
	public int  getlength () {
		return this.length;
	}
	public void setlength(int length) {
		this.length= length ;
}
	public int getwidth () {
		return this.width;
}
	public void setwidth (int width) {
		this.width = width ;
	}
	
	@Override
	public 	double area () {
		double area = length * width;
		
		return area;
	
}
}	
	
