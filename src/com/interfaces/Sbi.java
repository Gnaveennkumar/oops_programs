package com.interfaces;

public class Sbi implements Rbi{

	@Override
	public void checkBalance() {
		System.out.println("Sbi.checkBalance()");
	}

	@Override
	public void deposit() {
		System.out.println("Sbi.deposit()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Sbi.withdraw()");
	}

	@Override
	public void miniStatement() {
		System.out.println("Sbi.miniStatement()");
	}

	@Override
	public void pinChange() {
		System.out.println("Sbi.pinChange()");
	}

	@Override
	public void transaction() {
		System.out.println("Sbi.transaction()");
	}

}
