package com.gs.pattern.solid.liskovsubstitution;

public class FixedDepositAccount extends Account{

	@Override
	protected void deposit(Double depositAmout) {

		System.out.println("Deposited " + depositAmout);
		
	}

}
