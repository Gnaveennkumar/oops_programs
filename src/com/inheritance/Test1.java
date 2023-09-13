package com.inheritance;

public class Test1 {
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.id=10;
		s1.name="naveen";
		System.out.println(s1.id+"........"+s1.name);
		
		User u = new User();
		u.id=29;
		u.name="rani";
		System.out.println(u.id+"....."+u.name);
		
		s1.m1();
	}

}
