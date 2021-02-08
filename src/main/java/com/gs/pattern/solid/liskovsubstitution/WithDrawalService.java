package com.gs.pattern.solid.liskovsubstitution;

public class WithDrawalService {

	private WithdrawableAccount withdrawableAccount;

	public WithDrawalService(WithdrawableAccount withdrawableAccount) {

		this.withdrawableAccount = withdrawableAccount;

	}

	public void withdraw(Double withdrawableAmout) {
		
		withdrawableAccount.withdraw(withdrawableAmout);
		
	}
	

}
