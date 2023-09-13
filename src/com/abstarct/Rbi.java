package com.abstarct;

public abstract class Rbi {
	 
	void checkbalance() {
		System.out.println("Rbi.checkbalance()");
	}
	abstract void pin();
	abstract void miniStatement();
	abstract void deposit();
	abstract void withDrawl();

}
