package com.rays.oop.inheritanceOverriding;

public class Circle extends Shape {

	protected int radius;
	public int getradius () {
		return this.radius;
	
	}	
	public void setradius(int radius) {
		this.radius =radius ;

}
	@Override
	public double area () {
		double area = Math.PI * radius * radius ;
		return area ;
		
	}
}
