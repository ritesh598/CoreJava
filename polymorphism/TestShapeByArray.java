package com.rays.oop.polymorphism;

public class TestShapeByArray {

	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
//		Typecast
		Circle c = (Circle) s[0];
		c.setRadius(5);
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(5);
		r.setWidth(10);
		
		Triangle t = (Triangle) s[2];
		t.setBase(5);
		t.setHeight(6);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area() );
			
		}
	}

}

