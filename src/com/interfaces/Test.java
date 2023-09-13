package com.interfaces;

public class Test {
	public static void main(String[] args) {
		
		Sbi s = new Sbi();
		s.checkBalance();
		s.miniStatement();
		
		Axis  a = new Axis();
		a.deposit();
		a.pinChange();
		
		Hdfc h = new Hdfc();
		h.miniStatement();
		
		Icici i = new Icici();
		i.transaction();
		
		Kotak k = new Kotak();
		k.deposit();
		
		
		Rbi r = new Sbi();
		r.deposit();
				
	}

}
