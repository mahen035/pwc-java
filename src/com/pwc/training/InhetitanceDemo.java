package com.pwc.training;

public class InhetitanceDemo {

	public static void main(String[] args) {
		
		Car sCar = new SedanCar(20.8); // Parent class ref can refer to
										// child class object
		
		sCar.setMake("Honda"); // Dynamic Polymorphism
		
		sCar.setModel("City");
		
		//sCar.setCargoSize(12.34);
		
		//System.out.println(sCar);

	}

}

//1. Create an Account class
//    acctHolderName, acctNumber, acctBalance
//    withdraw(), deposit(), showBalance()
// 2. SavingsAccount class
//	  roi
// 3. create a test class where create one SavingsAccount
//    get input from the user for different actions: 1: deposit, 2: withdraw, 3: showBal
// display the account detail after performing some transactions
