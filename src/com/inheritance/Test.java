package com.inheritance;

public class Test {
	public static void main(String[] args) {
		
		A a= new A();
		a.m1(a);
		a.m1(new B());
		 B b = new B();
		 b.m1(null);
		 a=b;
		 a.m1(null);
		 a.m1(new A());
	}

}
