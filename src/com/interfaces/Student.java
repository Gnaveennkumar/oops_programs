package com.interfaces;

public class Student extends School implements Teacher,Exam {

	@Override
	public void student() {
		System.out.println("Student.student()");
		
	}

	@Override
	public void work() {
		System.out.println("Student.work()");
		
	}

}
