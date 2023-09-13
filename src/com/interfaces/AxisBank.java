package com.interfaces;

public class AxisBank implements Bank{

	@Override
	public void moneyTransfer() {
		System.out.println("AxisBank.moneyTransfer()");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("AxisBank.checkBalance()");
	}

}
