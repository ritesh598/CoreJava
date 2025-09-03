package com.rays.oop.inheritance;

public class TestShape extends Shape {
	public static void main(String[] args) {
		System.out.println("circle");
		Circle c= new Circle();
		c.setradius(5);
		c.setcoler("Black");
		c.setBorderWidht(2);
		
		System.out.println("redius:"  + c.getradius());
		System.out.println("coler:" + c.getcoler());
		System.out.println("borderwidht" + c.BorderWidht);
		System.out.println("ares of circle" + c.ares());
		
		
		System.out.println("----tringle-----");
		Triangle t= new Triangle ();
		 t.setbase(5);
		 t.setheight(5);
		t.setcoler("Blue");
		 t.setBorderWidht( 3);
		 
		 System.out.println("base:"  + t.getbase());
		 System.out.println("height:"+ t.getheight());
			System.out.println("coler:" + t.getcoler());
			System.out.println("borderwidht:" + t.BorderWidht);
			System.out.println("ares of triangle:" + t.area()); 
			
			System.out.println("-----rectangle-----");
			Rectangle r =new Rectangle ();
			 r.setlength(5);
			 r.setwidth(5);
			 r.setcoler("pink");
			 r.setBorderWidht( 4);
			 
			 System.out.println(" length:"  + r.getlength());
			 System.out.println("width:"+ r.getwidth());
				System.out.println("coler:" + r.getcoler());
				System.out.println("borderwidht:" +  r.getBorderWidht());
				System.out.println("ares of rectangle:" + r.area());
	}

}
