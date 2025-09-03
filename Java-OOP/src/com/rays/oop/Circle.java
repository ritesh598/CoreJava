package com.rays.oop.inheritance;

public class Circle extends Shape {
	private int radius;
	public int getradius () {
		return this.radius;
	
	}	
	public void setradius(int radius) {
		this.radius =radius ;

}
	public double ares () {
		double ares = Math.PI* radius *radius ;
		return ares;
}
}