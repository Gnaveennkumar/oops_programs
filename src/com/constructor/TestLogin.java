package com.constructor;

public class TestLogin {
	public static void main(String[] args) {
		Login l = new Login();

		l.setUserName("srinivas");
		System.out.println("l.getUserName");
		
		l.setPassWord("navi@11");
		System.out.println(l.getPassWord());
		
		l.setPhNumber(1234564789);
		System.out.println(l.getPhNumber());
	}

}
