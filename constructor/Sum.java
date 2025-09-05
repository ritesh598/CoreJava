package com.rays.oop.constructor;

public class Sum {
	
	public Sum () {
		System.out.println("this default constructor");
		
	}
	public Sum  (int i, int j) {
		System.out.println("sum of two int no:"+  (i + j));
			
	}
	public Sum  (double i , double j) {
		System.out.println("sum of two double no:"+  (i + j));
	}
	public Sum  (int i, double j ) {
		System.out.println("sum of two no:"+  (i+j));
	}

}
