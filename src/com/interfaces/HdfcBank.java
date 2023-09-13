package com.interfaces;

public class HdfcBank  implements Bank{

	@Override
	public void moneyTransfer() {
		System.out.println("HdfcBank.moneyTransfer()");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("HdfcBank.checkBalance()");
		
	}

}
