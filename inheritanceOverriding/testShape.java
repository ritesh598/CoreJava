package com.rays.oop.inheritanceOverriding;

public class testShape {
	public static void main(String[] args) {
		
		System.out.println("--------circle-------");
		Shape s1 = new Circle ();
		
		//type casting parent object to child object ;
		Circle c = (Circle) s1 ;
		c.setradius(5);
		c.setcoler("black");
		c.setBorderWidht(2);
		
		System.out.println("redius:"  + c.getradius());
		System.out.println("coler:" + c.getcoler());
		System.out.println("borderwidht" + c.BorderWidht);
		System.out.println("ares of circle" + c.area());
		
		System.out.println("--------triangle-------");
		Shape s2 = new  Triangle ();
		
		Triangle t= (Triangle )s2 ;
		t.setbase(5);
		t.setheight(5);
		t.setcoler("red");
		t.setBorderWidht(3);
		
		System.out.println("bash" + t.getbase());
		System.out.println("height" + t.getheight());
		System.out.println("coler" + t.getcoler());
		System.out.println("borderwidht" + t.BorderWidht);
		System.out.println("ares of tringle" + t.area());
		
		System.out.println("-----rectangle------");
		Shape s3 = new Rectangle();
		
		Rectangle r = (Rectangle)s3;
		r.setlength(5);
		r.setwidth(5);
		r.setcoler("yellow");
		r.setBorderWidht(4);
		
		System.out.println(" length:"  + r.getlength());
	    System.out.println("width:"+ r.getwidth());
		System.out.println("coler:" + r.getcoler());
		System.out.println("borderwidht:" +  r.getBorderWidht());
		System.out.println("ares of rectangle:" + r.area());
}
		
		
		
	}




