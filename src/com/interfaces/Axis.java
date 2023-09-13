package com.interfaces;

public class Axis implements Rbi {

	@Override
	public void checkBalance() {
		System.out.println("Axis.checkBalance()");
	}

	@Override
	public void deposit() {
		System.out.println("Axis.deposit()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Axis.withdraw()");
	}

	@Override
	public void miniStatement() {
		System.out.println("Axis.miniStatement()");
		
	}

	@Override
	public void pinChange() {
		System.out.println("Axis.pinChange()");
	}

	@Override
	public void transaction() {
		System.out.println("Axis.transaction()");
	}

}
