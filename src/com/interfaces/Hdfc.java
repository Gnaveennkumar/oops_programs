package com.interfaces;

public class Hdfc implements Rbi{

	@Override
	public void checkBalance() {
		System.out.println("Hdfc.checkBalance()");
	}

	@Override
	public void deposit() {
		System.out.println("Hdfc.deposit()");
		
	}

	@Override
	public void withdraw() {
	System.out.println("Hdfc.withdraw()");
		
	}

	@Override
	public void miniStatement() {
		System.out.println("Hdfc.miniStatement()");
		
	}

	@Override
	public void pinChange() {
		System.out.println("Hdfc.pinChange()");
		
	}

	@Override
	public void transaction() {
		System.out.println("Hdfc.transaction()");
		
	}

}
