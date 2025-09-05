package com.rays.oop.constructor;

 
public class TestAutoMobile {
	
	public static void main(String[] args) {
		
		 AutoMobile a = new AutoMobile("pink", 120, "Hyunda");
		 System.out.println("COLOR: " + a.getColor());
		 System.out.println("Speed: " + a.getSpeed());
		 System.out.println("Brand: " + a.getBrand());
		 System.out.println("Gear: " + a.NO_OF_GEARS);
		 
		 a.accelerator();
		 a.brake();
		 a.changeGear(5);
		 System.out.println("Final Speed: " + a.getSpeed() + " km/h");
	}

}
