package com.composition;

public class School {
	
	public static void main(String[] args) {
		Student s = new Student(101,"navi",23);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.age);
	}
}
