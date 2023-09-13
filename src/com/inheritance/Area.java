package com.inheritance;

public class Area {
	Circle circle = new Circle(1);
	
	public static void main(String[] args) {
		
		
		//Circle circle = new Circle(1);
		Area a = new Area();
		a.circle.calculateArea();
		System.out.println(a.circle.calculateArea());
	}
}
