package com.interfaces;

public class Kotak implements Rbi{

	@Override
	public void checkBalance() {
		System.out.println("Kotak.checkBalance()");
		
	}

	@Override
	public void deposit() {
		System.out.println("Kotak.deposit()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Kotak.withdraw()");
		
	}

	@Override
	public void miniStatement() {
		System.out.println("Kotak.miniStatement()");
		
	}

	@Override
	public void pinChange() {
		System.out.println("Kotak.pinChange()");
		
	}

	@Override
	public void transaction() {
		System.out.println("Kotak.transaction()");
		
	}

}
