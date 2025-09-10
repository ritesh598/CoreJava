package com.rays.oop.abstraction;



public class TestShape {
	
	public static void main(String[] args) {
		
		Shape s = new Circle () ;
		System.out.println("------circle-------");
		
	
		Circle c = (Circle) s ;
		c.setRadius(5);
		System.out.println(c.getRadius());
		System.out.println(c.area());
		
		Shape s1 = new Rectangle();
		
		System.out.println("------rectangle------");
		
		Rectangle r =  (Rectangle) s1 ;
		r.setlength(5);
		r.setwidth(5);
		
		System.out.println(r.getlength());
		System.out.println(r.getwidth());
		System.out.println(r.area());
		
		Shape s2 = new Triangle ();
		System.out.println("-----triangle----");
		
		Triangle t = (Triangle) s2 ;
		t.setbase(5);
		t.setheight(5);
		
		System.out.println(t.getbase());
        System.out.println(t.getheight());
        System.out.println(t.area());
	}

}
