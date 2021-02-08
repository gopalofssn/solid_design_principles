package com.gs.pattern.solid.liskovsubstitution;

public class SavingsAccount extends WithdrawableAccount{

	@Override
	public void withdraw(Double withdrawAmount) {

		System.out.println("Withdrawed " + withdrawAmount);
		
	}

	@Override
	protected void deposit(Double depositAmout) {

		System.out.println("Deposited " + depositAmout);
		
	}

}
