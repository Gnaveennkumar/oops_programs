package com.interfaces;

public class Icici implements Rbi{

	@Override
	public void checkBalance() {
		System.out.println("Icici.checkBalance()");
	}

	@Override
	public void deposit() {
		System.out.println("Icici.deposit()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Icici.withdraw()");
		
	}

	@Override
	public void miniStatement() {
		System.out.println("Icici.miniStatement()");
		
	}

	@Override
	public void pinChange() {
		System.out.println("Icici.pinChange()");
		
	}

	@Override
	public void transaction() {
		System.out.println("Icici.transaction()");
		
	}

}
