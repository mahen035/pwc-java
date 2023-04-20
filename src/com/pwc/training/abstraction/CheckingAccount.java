package com.pwc.training.abstraction;

public class CheckingAccount extends Account{

	float roi;
	@Override
	public void calculateMaturity() {
		
		balance = balance + (roi/100)*balance;
	}

}
